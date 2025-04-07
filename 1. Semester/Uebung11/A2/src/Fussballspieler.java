
public abstract class Fussballspieler implements Finanzen {

    private String name;
    private int jahreseinkommen;

    public Fussballspieler(String name) {
        this.name = name;
        this.jahreseinkommen = 0;
    }

    public void gehaltBeziehen(int gehalt) {
        jahreseinkommen = jahreseinkommen + gehalt;
    }

    public String toString() {
        return name + " " + jahreseinkommen;
    }
}
