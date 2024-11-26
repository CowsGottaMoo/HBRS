
public class Palindromzahl {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(spiegeln(number));
        System.out.println(spiegelAddieren(number));
        while (palindromTest(number) == false) {
            number = spiegelAddieren(number);
        }
        System.out.println(number);
    }

    public static int spiegeln(int zahl) {
        int ergebnis = 0;
        while (zahl > 0) {
            int ziffer = zahl % 10;
            ergebnis = ergebnis * 10 + ziffer;
            zahl = zahl / 10;
        }
        return ergebnis;
    }

    public static int spiegelAddieren(int zahl) {
        int ergebnis = 0;
        int origin = zahl;
        while (zahl > 0) {
            int ziffer = zahl % 10;
            ergebnis = ergebnis * 10 + ziffer;
            zahl = zahl / 10;
        }
        ergebnis = ergebnis + origin;
        return ergebnis;
    }

    public static boolean palindromTest(int zahl) {
        boolean ergebnis = false;
        int gespiegelt = spiegeln(zahl);
        if (gespiegelt == zahl) {
            ergebnis = true;
        }
        return ergebnis;
    }
}
