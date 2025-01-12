
import java.io.*;
import java.util.*;

public class LaborStand {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Fehler: Bitte genau 2 Argumente eingeben");
            return;
        }

        int maxAnzahlDatensaetze;
        try {
            maxAnzahlDatensaetze = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Fehler: Ungueltige Zahl bei maximale Anzahl der Datensaetze");
            return;
        }

        Scanner sc;
        try {
            sc = new Scanner(new File(args[1]));
        } catch (FileNotFoundException ex) {
            System.out.println("Datei nicht gefunden");
            return;
        }

        MessReihe messReihe = new MessReihe(maxAnzahlDatensaetze);

        while (sc.hasNext()) {
            try {
                int u = sc.nextInt();
                double t = sc.nextDouble();
                double d = sc.nextDouble();
                messReihe.neueMessung(u, t, d);
            } catch (IllegalValue ex) {
                System.out.println("Fehler: " + ex.getMessage());
            } catch (CriticalValue ex) {
                System.out.println("Fehler: " + ex.getMessage());
                System.exit(1);
            } catch (TooMuchData ex) {
                System.out.println("Fehler: " + ex.getMessage());
                break;
            }
        }
        sc.close();

        double[] mittelwerte = messReihe.ermittleMittelwerte();
        System.out.println("Durschnitt von Umdrehungszahl: " + mittelwerte[0]);
        System.out.println("Durschnitt von Temperatur:     " + mittelwerte[1]);
        System.out.println("Durschnitt von Ladedruck:      " + mittelwerte[2]);
    }
}
