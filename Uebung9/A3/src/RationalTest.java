
import java.util.Scanner;

public class RationalTest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Rational rat = null;

        while (true) {
            String eingabe = scn.nextLine();

            if (eingabe.equals(".")) {
                break;
            }

            if (rat == null) {
                String[] erste = eingabe.split(" ");
                int zaehl = Integer.parseInt(erste[0]);
                int nenn = Integer.parseInt(erste[1]);
                rat = new Rational(zaehl, nenn);
            } else {
                char operator = eingabe.charAt(0);
                String[] zweite = eingabe.substring(1).split(" ");
                int zaehl = Integer.parseInt(zweite[0]);
                int nenn = Integer.parseInt(zweite[1]);
                Rational rat2 = new Rational(zaehl, nenn);

                switch (operator) {
                    case '+' ->
                        rat = rat.add(rat2);
                    case '-' ->
                        rat = rat.sub(rat2);
                    case '*' ->
                        rat = rat.mul(rat2);
                    case '/' ->
                        rat = rat.div(rat2);
                    default ->
                        System.out.println("Ungueltig");
                }
            }
        }
        System.out.println("Ergebnis: " + rat);
        scn.close();
    }
}
