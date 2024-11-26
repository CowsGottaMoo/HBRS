
public class Klausurnoten {

    public static void main(String[] args) {
        int[] teilnehmerPunkte = {30, 74, 81, 67, 95, 65};
        int[] grenzWerte = {59, 69, 79, 89};
        verarbeiteKlausurPunktzahl(teilnehmerPunkte, grenzWerte);
    }

    public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen) {
        double avg = durschnittsPunktzahl(punkte);
        int[] noten = ermittleNote(punkte, punktGrenzen);
        System.out.println(punkte.length); //Anzahl Teilnehmer
        System.out.println(minMaxNote(noten)[0] + " " + minMaxNote(noten)[1]); //Min/Max Note
        System.out.println(anzahlBestanden(noten)[0] + " " + anzahlBestanden(noten)[1]); //Bestanden/Nicht Bestanden
        System.out.println(avg); //Durchschnitt
        histogramm(noten);
    }

    public static int[] ermittleNote(int[] punkte, int[] punktGrenzen) {
        int note[] = punkte;
        for (int i = 0; i < punkte.length; i++) {
            if (punkte[i] <= punktGrenzen[0]) {
                note[i] = 5;
            } else if (punkte[i] <= punktGrenzen[1]) {
                note[i] = 4;
            } else if (punkte[i] <= punktGrenzen[2]) {
                note[i] = 3;
            } else if (punkte[i] <= punktGrenzen[3]) {
                note[i] = 2;
            } else {
                note[i] = 1;
            }
        }
        return note;
    }

    public static int[] minMaxNote(int[] note) {
        int min = note[0];
        int max = note[0];

        for (int i = 0; i < note.length; i++) {
            if (min > note[i]) {
                min = note[i];
            } else if (max < note[i]) {
                max = note[i];
            }
        }
        return new int[]{min, max};
    }

    public static int[] anzahlBestanden(int[] noten) {
        int bestanden = 0;
        int nichtBestanden = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] <= 4) {
                bestanden++;
            } else {
                nichtBestanden++;
            }
        }
        return new int[]{bestanden, nichtBestanden};
    }

    public static double durschnittsPunktzahl(int[] punkte) {
        double ergebnis = 0;
        for (int i = 0; i < punkte.length; i++) {
            ergebnis += punkte[i];
        }
        return ergebnis / punkte.length;
    }

    public static void histogramm(int[] noten) {
        int[] histogramm = new int[5];
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] >= 1 && noten[i] <= 5) {
                histogramm[noten[i] - 1]++;
            }
        }

        for (int i = 0; i < histogramm.length; i++) {
            System.out.println((i + 1) + " " + histogramm[i]);
        }
    }
}
