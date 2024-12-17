
public class ReelleZahl extends Zahl {

    private double wert;

    public ReelleZahl(double r) {
        this.wert = r;
    }

    public Zahl addieren(Zahl x) {
        ReelleZahl z = (ReelleZahl) x;
        return new ReelleZahl(this.wert + z.wert);
    }

    public Zahl subtrahieren(Zahl x) {
        ReelleZahl z = (ReelleZahl) x;
        return new ReelleZahl(this.wert - z.wert);
    }

    public Zahl multiplizieren(Zahl x) {
        ReelleZahl z = (ReelleZahl) x;
        return new ReelleZahl(this.wert * z.wert);
    }

    public Zahl dividieren(Zahl x) {
        ReelleZahl z = (ReelleZahl) x;
        return new ReelleZahl(this.wert / z.wert);
    }

    public String toString() {
        return String.valueOf(wert);
    }
}
