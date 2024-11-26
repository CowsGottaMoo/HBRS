
public class Parasitenzahl {

    public static void main(String[] args) {
        long zahl = Long.parseLong(args[0]);
        for (long counter = 1; counter <= zahl; counter++) {
            if (istParasit(counter)) {
                System.out.println(counter);
            }
        }
    }

    public static boolean istParasit(long zahl) {
        long ziffer = zahl % 10;
        long restZahl = zahl / 10;
        long verschoben = verschiebeRest(restZahl, ziffer);
        return zahl * ziffer == verschoben;
    }

    public static long verschiebeRest(long zahl, long verschiebeUm) {
        long multi = 1;
        long tmp = zahl;
        while (tmp > 0) {
            tmp /= 10;
            multi *= 10;
        }
        return verschiebeUm * multi + zahl;
    }
}
