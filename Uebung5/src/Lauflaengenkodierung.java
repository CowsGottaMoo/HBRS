import java.util.Scanner;

public class Lauflaengenkodierung {
    public static void main(String[] args) {
        int alteZahl = -1;
        int kette = 0;
        Scanner scn = new Scanner(System.in);
        String ergebnis = "";

        while (scn.hasNextInt()) {
            int i = scn.nextInt();
            if (i == alteZahl) {
                kette++;
            } else {
                if (0 < kette) {
                    ergebnis = ergebnis + kette + "x" + alteZahl + ".";
                }
                kette = 1;
            }
            alteZahl = i;
        }
        if (0 < kette) {
            ergebnis = ergebnis + kette + "x" + alteZahl + ".";
        }
        scn.close();
        System.out.println(ergebnis);
    }
}
