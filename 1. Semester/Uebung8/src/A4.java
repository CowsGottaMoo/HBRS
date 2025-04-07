
public class A4 {

    public static void main(String[] args) {
        String[] feld = {"Hello", "World"};
        String[] inhalt = verdoppeln(feld);
        String[] referenz = referenzeStrings(feld);
        if (!testInhaltGleich(inhalt, referenz)) {
            System.out.println("Fehler: Inhalte stimmen nicht ueberein");
        }
        if (testReferenzGleich(inhalt, referenz)) {
            System.out.println("Fehler: Referenzen muessen unterschiedlich sein");
        }
    }

    public static String[] verdoppeln(String[] feld) {
        String[] neu = new String[feld.length * 2];
        for (int i = 0; i < feld.length; i++) {
            neu[2 * i] = feld[i];
            neu[2 * i + 1] = feld[i];
        }
        return neu;
    }

    public static String[] referenzeStrings(String[] feld) {
        String[] neu = new String[feld.length];
        for (int i = 0; i < feld.length; i++) {
            neu[2 * i] = feld[i] + "";
            neu[2 * i + 1] = feld[i];
        }
        return neu;
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
