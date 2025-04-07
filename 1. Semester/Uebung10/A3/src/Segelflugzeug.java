
public class Segelflugzeug extends Flugzeug {

    private static int counter;

    public Segelflugzeug(double spannweite) {
        super(spannweite, 1);
        counter++;
    }

    public String toString() {
        return super.toString() + " (Segelflugzeug)";
    }

    public static int getCounter() {
        return counter;
    }
}
