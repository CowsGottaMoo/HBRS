
public class Rational {

    int zaehler;
    int nenner;

    public Rational(int zaehler, int nenner) {
        if (nenner == 0) {
            System.out.println("Fehler: Nenner ist 0");
            return;
        }
        int ggT = ggT(zaehler, nenner);
        this.zaehler = zaehler / ggT;
        this.nenner = nenner / ggT;

        if (this.nenner < 0) {
            this.zaehler = -this.zaehler;
            this.nenner = -this.nenner;
        }
    }

    public Rational(int ganzeZahl) {
        this.zaehler = ganzeZahl;
        this.nenner = 1;
    }

    public int ggT(int a, int b) {
        return b == 0 ? Math.abs(a) : ggT(b, a % b);
    }

    public String toString() {
        return zaehler + "/" + nenner;
    }

    public Rational add(Rational r2) {
        int neuZaehler = this.zaehler * r2.nenner + r2.zaehler * this.nenner;
        int neuNenner = this.nenner * r2.nenner;
        return new Rational(neuZaehler, neuNenner);
    }

    public Rational sub(Rational r2) {
        int neuZaehler = this.zaehler * r2.nenner - r2.zaehler * this.nenner;
        int neuNenner = this.nenner * r2.nenner;
        return new Rational(neuZaehler, neuNenner);
    }

    public Rational mul(Rational r2) {
        int neuZaehler = this.zaehler * r2.zaehler;
        int neuNenner = this.nenner * r2.nenner;
        return new Rational(neuZaehler, neuNenner);
    }

    public Rational div(Rational r2) {
        if (r2.zaehler == 0) {
            System.out.println("Fehler: Division durch 0");
        }
        int neuZaehler = this.zaehler * r2.nenner;
        int neuNenner = this.nenner * r2.zaehler;
        return new Rational(neuZaehler, neuNenner);
    }
}
