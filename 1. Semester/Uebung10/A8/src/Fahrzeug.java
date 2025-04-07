
public class Fahrzeug {

    private int anzRad;
    private int anzSitz;
    private static int counter = 0;

    public Fahrzeug(int anzRad, int anzSitz) {
        this.anzRad = anzRad;
        this.anzSitz = anzSitz;
        counter++;
    }

    public static int getAnzahl() {
        return counter;
    }

    public String toString() {
        return "Fahrzeug mit " + anzRad + " Rädern und " + anzSitz + " Sitze";
    }
}
