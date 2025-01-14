
public class KomplexeZahl extends Zahl {

    private double realTeila;
    private double imagTeilb;

    public KomplexeZahl(double a, double b) {
        this.realTeila = a;
        this.imagTeilb = b;
    }

    public String toString() {
        return realTeila + "+" + imagTeilb + "*i";
    }

    public Zahl addieren(Zahl z) {
        KomplexeZahl kz = (KomplexeZahl) z;
        return new KomplexeZahl(this.realTeila + kz.realTeila, this.imagTeilb + kz.imagTeilb);
    }

    public Zahl subtrahieren(Zahl z) {
        KomplexeZahl kz = (KomplexeZahl) z;
        return new KomplexeZahl(this.realTeila - kz.realTeila, this.imagTeilb - kz.imagTeilb);
    }

    public Zahl multiplizieren(Zahl z) {
        KomplexeZahl kz = (KomplexeZahl) z;
        double a = this.realTeila * kz.realTeila - this.imagTeilb * kz.imagTeilb;
        double b = this.realTeila * kz.imagTeilb + this.imagTeilb * kz.realTeila;
        return new KomplexeZahl(a, b);
    }

    public Zahl dividieren(Zahl z) {
        KomplexeZahl kz = (KomplexeZahl) z;
        double nenner = kz.realTeila * kz.realTeila + kz.imagTeilb * kz.imagTeilb;
        double a = (this.realTeila * kz.realTeila + this.imagTeilb * kz.imagTeilb) / nenner;
        double b = (this.imagTeilb * kz.realTeila - this.realTeila * kz.imagTeilb) / nenner;
        return new KomplexeZahl(a, b);
    }
}
