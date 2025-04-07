
public class Lounge {

    Getraenkekarte gk;
    String karte;

    public Lounge(Getraenkekarte gk) {
        this.gk = gk;
        this.karte = gk.toString();
    }

    public void bestellen(Person p, String name) {
        int alter = p.alter;
        Getraenk getraenk = gk.suchen(name);
        if (alter >= getraenk.freigabealter) {
            System.out.println("bitte schoen, ihr Getraenk");
        } else {
            System.out.println("nicht alt genug fuer das Getraenk");
        }
    }
}
