
public class Jahr {

    int jahreszahl;
    Tag[] tage = new Tag[365];

    public Jahr(int jahreszahl) {
        this.jahreszahl = jahreszahl;
        for (int i = 0; i < 365; i++) {
            tage[i] = new Tag();
        }
    }

    public void eintragen(int tag, String was, int prioritaet) {
        if (tage[tag - 1] != null) {
            System.out.println("Fehler: Tag ist nicht im Kalendar");
        } else if (tage[tag - 1].getPrioritaet() < 0 || tage[tag - 1].getPrioritaet() > 10) {
            System.out.println("Fehler: Prioritaet ist nicht zwischen 0 und 10");
        }
        tage[tag - 1] = new Tag(was, prioritaet);
    }

    public String getTermin(int tag) {
        String t = tage[tag - 1].getVerabredung();
        return t;
    }

    public int getPrioritaet(int tag) {
        int p = tage[tag - 1].getPrioritaet();
        return p;
    }

    public int getBelegt() {
        int belegt = 0;
        for (int i = 0; i < 365; i++) {
            if (tage[i].getVerabredung() != null) {
                belegt++;
            }
        }
        return belegt;
    }

}
