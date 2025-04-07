
public class Polynom {

    private double[] koeffizienten;
    private static int anzahlPolynome = 0;

    public Polynom(double[] koeffizienten) {
        int grad = koeffizienten.length;
        while (grad > 0 && koeffizienten[grad - 1] == 0) {
            grad--;
        }

        this.koeffizienten = new double[grad];
        for (int i = 0; i < grad; i++) {
            this.koeffizienten[i] = koeffizienten[i];
        }
        anzahlPolynome++;
    }

    public String toString() {
        if (koeffizienten.length == 0) {
            return "0";
        }

        String ausgabe = "";
        for (int i = koeffizienten.length - 1; i >= 0; i--) {
            if (koeffizienten[i] != 0) {
                if (!ausgabe.isEmpty()) {
                    ausgabe += " + ";
                }
                ausgabe += koeffizienten[i] + "*x^" + i;
            }
        }
        return ausgabe;
    }

    public double auswerten(double x) {
        double ergebnis = 0;
        for (int i = koeffizienten.length - 1; i >= 0; i--) {
            ergebnis = ergebnis * x + koeffizienten[i];
        }
        return ergebnis;
    }

    public static int getAnzahl() {
        return anzahlPolynome;
    }
}
