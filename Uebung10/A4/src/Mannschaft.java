
public class Mannschaft {

    Fussballspieler s1;
    Fussballspieler s2;
    Fussballspieler s3;
    Fussballspieler s4;
    Fussballspieler s5;

    public Mannschaft(Fussballspieler s1, Fussballspieler s2, Fussballspieler s3, Fussballspieler s4, Fussballspieler s5) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
    }

    public int einkommen() {
        return s1.getEinkommen() + s2.getEinkommen() + s3.getEinkommen() + s4.getEinkommen() + s5.getEinkommen();
    }

    public String toString() {
        return "1. " + s1.getName() + "\n2. " + s2.getName() + "\n3. " + s3.getName() + "\n4. " + s4.getName() + "\n5. " + s5.getName() + "\n";
    }
}
