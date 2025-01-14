
public class Passagierflugzeug extends Flugzeug {

    private double schub;
    private static int counter;

    public Passagierflugzeug(double spannweite, int sitzkapazitaet, double schub) {
        super(spannweite, sitzkapazitaet);
        this.schub = schub;
        counter++;
    }

    public String toString() {
        return super.toString() + " Schub: " + schub + " (Passagierflugzeug)";
    }

    public static int getCounter() {
        return counter;
    }
}
