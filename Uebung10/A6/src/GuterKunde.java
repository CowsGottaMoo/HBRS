
public class GuterKunde extends Kunde {

    private double rabatt;

    public GuterKunde(String vorname, String nachname, double rabatt) {
        super(vorname, nachname);
        this.rabatt = rabatt;
    }

    public double getNachlass() {
        return rabatt;
    }
}
