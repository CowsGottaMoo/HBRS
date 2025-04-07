
public class Stadion {

    public static void main(String[] args) {
        Fussballspieler[] rot = new Fussballspieler[5];
        Fussballspieler[] blau = new Fussballspieler[5];

        for (int s = 0; s < 5; s++) {
            rot[s] = new Fussballspieler("Spieler-rot-" + (s + 1), 10000 * (s + 1));
            blau[s] = new Fussballspieler("Spieler-blau-" + (s + 1), 20000 * (s + 1));
        }

        Mannschaft rote = new Mannschaft(rot[0], rot[1], rot[2], rot[3], rot[4]);
        Mannschaft blaue = new Mannschaft(blau[0], blau[1], blau[2], blau[3], blau[4]);

        Person[] zuschauer = new Person[45000];
        for (int i = 0; i < zuschauer.length; i++) {
            zuschauer[i] = new Person("Zuschauer-" + (i + 1));
        }

        System.out.println(rote.toString());
        System.out.println(blaue.toString());

        System.out.println(rote.einkommen());
        System.out.println(blaue.einkommen());
        System.out.println("");
        System.out.println(zuschauer[0].getName());
    }
}
