
public class Fussballspieler extends Person {

    private int einkommen;

    public Fussballspieler(String name, int einkommen) {
        super(name);
        this.einkommen = einkommen;
    }

    public int getEinkommen() {
        return einkommen;
    }

    public String toString() {
        return super.toString() + " " + einkommen;
    }

}
