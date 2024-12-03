
public class Maina2 {

    public static void main(String[] args) {
        Getraenkekarte gk = new Getraenkekarte();
        gk.neuesGetraenk(new Getraenk("Cola", 200, 250, 0));
        gk.neuesGetraenk(new Getraenk("Bier", 200, 200, 16));
        gk.neuesGetraenk(new Getraenk("Vodka", 20, 300, 18));

        Lounge lounge = new Lounge(gk);
        Person paul = new Person("Paul", 16);
        System.out.println("Unsere Karte:\n" + lounge.karte);

        lounge.bestellen(paul, "Vodka");
        lounge.bestellen(paul, "Bier");
    }
}
