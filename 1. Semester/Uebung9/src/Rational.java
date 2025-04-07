
public class Rational {

    public static void main(String[] args) {
        int zaehler = 1;
        int nenner = -2;
        int ggT = ggT(zaehler, nenner);
        zaehler = zaehler / ggT;
        nenner = nenner / ggT;
        if (nenner < 0) {
            nenner = -nenner;
            zaehler = -zaehler;
        }
        System.out.println(toString(zaehler, nenner));

        // Rational r = new Rational(zaehler, nenner);
    }

    public Rational(int zaehler, int nenner) {
        if (nenner == 0) {
            System.out.println("Fehler: Nenner ist 0");
            return;
        }

        int tmpZaehler = zaehler;
        int tmpNenner = nenner;
        int ggT = ggT(tmpZaehler, tmpNenner);
        zaehler = tmpZaehler / ggT;
        nenner = tmpNenner / ggT;

        if (nenner < 0) {
            zaehler = -zaehler;
            nenner = -nenner;
        }
    }

    public static int ggT(int a, int b) {
        return b == 0 ? Math.abs(a) : ggT(b, a % b);
    }

    public static String toString(int zaehler, int nenner) {
        return zaehler + "/" + nenner;
    }
}
