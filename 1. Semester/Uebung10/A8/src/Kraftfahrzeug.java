
public class Kraftfahrzeug extends Fahrzeug {

    private int motoriesierung;
    private static int anzKFZ;

    public Kraftfahrzeug(int anzRad, int anzSitz, int motoriesierung) {
        super(anzRad, anzSitz);
        this.motoriesierung = motoriesierung;
        anzKFZ++;
    }

    public String toString() {
        return super.toString() + " und " + motoriesierung + " PS";
    }

    public static int getAnzahl() {
        return anzKFZ;
    }
}
