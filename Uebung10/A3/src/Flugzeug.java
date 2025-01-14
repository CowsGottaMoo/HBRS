
public class Flugzeug {

    private double spannweite;
    private int sitzkapazitaet;
    private static int counter;

    public Flugzeug(double spannweite, int sitzkapazitaet) {
        this.spannweite = spannweite;
        this.sitzkapazitaet = sitzkapazitaet;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String toString() {
        return "Spannweite: " + spannweite + " Sitze: " + sitzkapazitaet;
    }
}
