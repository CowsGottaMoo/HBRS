
public class Polynom {

    double[] koeffizienten;

    public Polynom(double[] koeffizienten) {
        int grad = koeffizienten.length;
        this.koeffizienten = new double[grad + 1];
        for (int i = 0; i < grad; i++) {
            if (koeffizienten[i] == 0) {

            }
            this.koeffizienten[i] = koeffizienten[i];
        }

    }

    public String toString() {
        String ausgabe = "";
        for (int i = koeffizienten.length - 1; i >= 0; i--) {
            if (koeffizienten[i] != 0) {
                if (ausgabe.length() > 0) {
                    if (koeffizienten[i] > 0) {
                        ausgabe += " + ";
                    } else {
                        ausgabe += " - ";
                    }
                }
                if (Math.abs(koeffizienten[i]) != 1 || i == koeffizienten.length - 1) {
                    ausgabe += Math.abs(koeffizienten[i]);
                }
                if (i < koeffizienten.length - 1) {
                    if (koeffizienten[i] < 0) {
                        ausgabe += "x";
                    } else {
                        ausgabe += "x";
                    }
                    if (i > 0) {
                        ausgabe += "^" + i;
                    }
                }
            }
            return ausgabe;
        }
    }
