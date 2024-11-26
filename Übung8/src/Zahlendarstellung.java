public class Zahlendarstellung {
    public static void main(String[] args) {
        int[] zahlen = ermittleZiffern(1234, 16);
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + " ");
        }
    }

    public static int[] ermittleZiffern(int x, int b) {
        int[] ziffern = new int[ermittleLaenge(x, b)];
        if (b <= 1) {
            return null;
        }

        if (x == 0) {
            return new int[]{0};
        }

        for (int i = 0; i < ziffern.length; i++) {
            ziffern[i] = x % b;
            x = x / b;
        }
        return ziffern;
    }

    public static int ermittleLaenge(int zahl, int basis) {
        int counter = 0;
        do {
            zahl = zahl / basis;
            counter++;
        } while (zahl != 0);
        return counter;
    }
}
