    public class Palindromzahl2 {
        public static void main(String[] args) {
            //int n = Integer.parseInt(args[0]);
            int n = 651;
            System.out.println(spiegeln(n));
            System.out.println(spiegelAddieren(n));
    
            while (!palindromTest(n)) {
                n = spiegelAddieren(n);
            }
            System.out.println(n);
        }

        public static int spiegeln(int zahl) {
            int spiegel = 0;
            while (zahl > 0) {
                int letzteZiffer = zahl % 10;
                spiegel = spiegel * 10 + letzteZiffer;
                zahl = zahl / 10;
            }
            return spiegel;
        }
    
        public static int spiegelAddieren(int zahl) {
            int spiegel = spiegeln(zahl);
            return zahl + spiegel;
        }
    
        public static boolean palindromTest(int zahl) {
            return zahl == spiegeln(zahl);
        }
    }
