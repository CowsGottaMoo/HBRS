
public class MessBereich {

    private final double von;
    private final double bis;
    private final double kritisch;

    public MessBereich(double von, double bis, double kritisch) {
        this.von = von;
        this.bis = bis;
        this.kritisch = kritisch;
    }

    public void pruefen(double wert) throws IllegalValue, CriticalValue {
        if (wert < von || wert > bis) {
            throw new IllegalValue("IllegalValue in der Messung");
        }
        if (wert >= kritisch) {
            throw new CriticalValue("CriticalValue, Messung ist kritisch");
        }
    }
}
