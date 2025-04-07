
public class Vertauschen {

    public static void main(String[] args) {
        //String[] test = {"hallo", "welt", "test", "letztes"};
        //String[] inhalt = vertauscheInhalt(test);
        //String[] referenz = vertauscheReferenz(test);
        String[] inhalt = vertauscheInhalt(args);
        String[] referenz = vertauscheReferenz(args);

        if (!testInhaltGleich(inhalt, referenz)) {
            System.out.println("Fehler: Inhalte stimmen nicht ueberein");
        }
        if (testReferenzGleich(inhalt, referenz)) {
            System.out.println("Fehler: Referenzen muessen unterschiedlich sein");
        }
    }

    public static String[] vertauscheInhalt(String[] Feld) {
        String[] neues = new String[Feld.length];
        for (int i = 0; i < Feld.length; i++) {
            neues[i] = Feld[Feld.length - i - 1] + "";
            //System.out.println(neues[i]);
        }
        return neues;
    }

    public static String[] vertauscheReferenz(String[] Feld) {
        String[] neues = new String[Feld.length];
        for (int i = 0; i < Feld.length; i++) {
            neues[i] = Feld[Feld.length - i - 1];
        }
        return neues;
    }

    public static boolean testInhaltGleich(String[] arg1, String[] arg2) {
        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i].equals(arg2[arg2.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean testReferenzGleich(String[] arg1, String[] arg2) {
        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] != arg2[i]) {
                return false;
            }
        }
        return true;
    }
}
