
public class A3 {

    public static void main(String[] args) {
        double[] b = {4, 2, 5, 3};
        double[] a = {5, 6, 7, 1};

        System.out.println(unregelmaessig(b, a));
    }

    public static double kettenbruchBerechnen(double[] feld) {
        int length = feld.length;
        if (length == 0) {
            System.out.println("Fehler: Das feld darf nicht leer sein");
            return -1;
        }

        double ergebnis = feld[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            ergebnis = feld[i] + 1 / ergebnis;
        }
        return ergebnis;
    }

    public static double unregelmaessig(double[] b, double[] a) {
        int bLength = b.length;

        double ergebnis = b[b.length - 1];
        for (int i = bLength - 2; i >= 0; i--) {
            ergebnis = a[i] + 1 / ergebnis;
        }
        return ergebnis;
    }
}
