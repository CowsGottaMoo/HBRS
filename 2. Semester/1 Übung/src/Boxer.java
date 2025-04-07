
public class Boxer extends Sportler {

    private double ge;

    public Boxer(String n, int g, int gr, double ge) {
        super(n, g, gr, ge);
        this.ge = ge;
    }

    @Override
    public String info() {
        return gewichtsklasse();
    }

    public String gewichtsklasse() {
        if (this.ge <= 70.0) {
            return "Leicht";
        } if (this.ge > 70 && this.ge < 90.0) {
            return "Mittel";
        } if (this.ge <= 90.0) {
            return "Schwer";
        } else {
            return "Fehler: Gewichtsklasse nicht definiert";
        }
    }

    public void setGewicht(double x) {
        this.ge = x;
    }

}
