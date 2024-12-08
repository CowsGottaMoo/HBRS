
public class Weg {

    Punkt[] weg = new Punkt[1];
    int i = 0;

    public Weg(int x, int y) {
        Punkt p = new Punkt(x, y);
        weg[i] = p;
        i++;
    }

    public int getAnzahl() {
        int counter = 0;
        for (int i = 0; i < weg.length; i++) {
            if (weg[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void verlaengern(Weg w) {
        Punkt[] ergebnis = new Punkt[weg.length + w.weg.length];

        for (int i = 0; i < weg.length; i++) {
            ergebnis[i] = weg[i];
        }
        for (int j = 0; j < w.weg.length; j++) {
            ergebnis[weg.length + j] = w.weg[j];
        }
        weg = ergebnis;
    }

    public String toString() {
        String erg = "";
        for (int l = 0; l < weg.length; l++) {
            if (l == weg.length - 1) {
                erg += weg[l].toString();
            } else {
                erg += weg[l].toString() + "-";
            }
        }
        return erg;
    }
}
