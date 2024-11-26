public class BitQuersumme {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int zaehler = 0;

        for (int k = 0; k < 16; k++) {
            zaehler += i & 1;
            i >>= 1;
        }

        System.out.println(zaehler);

    }
}
