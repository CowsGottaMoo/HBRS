
public class Main {

    public static void main(String[] args) {
        Student willi = new Student("Willi", "Wichtig", 900);
        Student helga = new Student("Helga", "Eifrig", 901);

        Ergebnis e1 = new Ergebnis(willi, 4.0f, 60);
        Ergebnis e2 = new Ergebnis(helga, 1.0f, 118);

        Pruefung eidp = new Pruefung("Einführung in die Programmierung", "29.01.2025", 9);
        //eidp.neuesErgebnis(e1);
        //eidp.neuesErgebnis(e2);
        System.out.println(eidp);
        System.out.println(e1);
        System.out.println(e2);
    }
}
