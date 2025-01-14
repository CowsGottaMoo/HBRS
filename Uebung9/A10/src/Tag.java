
public class Tag {

    String termin;
    int prio;

    public Tag() {
        this.prio = 0;
        this.termin = null;
    }

    public Tag(String termin, int prio) {
        this.prio = prio;
        this.termin = termin;
    }

    public void eintragen(String was, int prioritaet) {
        this.termin = was;
        this.prio = prioritaet;
    }

    public String getVerabredung() {
        return termin;
    }

    public int getPrioritaet() {
        return prio;
    }
}
