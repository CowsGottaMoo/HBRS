import java.util.Scanner;

public class LaengsteKette {
    public static void main(String[] args) {
        int alteZahl = -1;
        int laengsteKette = 0;
        int kette = 0;
        Scanner scn = new Scanner(System.in);

        while (scn.hasNextInt()) {
            int i = scn.nextInt();
            if (i == alteZahl) {
                kette++;
            } else {
                if (laengsteKette < kette) {
                    laengsteKette = kette + 1;
                }
                kette = 0;
            }
            alteZahl = i;
        }
        scn.close();
        System.out.println(laengsteKette);
    }
}
