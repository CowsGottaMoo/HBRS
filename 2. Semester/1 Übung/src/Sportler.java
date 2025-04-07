
public abstract class Sportler extends Person {

    private int groesse; //in cm
    private double gewicht; //in kg

    public Sportler(String n, int g, int gr, double ge) {
        super(n, g);
        this.groesse = gr;
        this.gewicht = ge;
    }

    public int groesse() {
        return this.groesse;
    }

    public double gewicht() {
        return this.gewicht;
    }

    public abstract String info();

    @Override
    public String toString() {
        return super.toString() + " " + this.groesse + "cm " + this.gewicht + "kg";
    }
}
