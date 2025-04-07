
import java.util.Scanner;

public class RationalTest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Rational rat = null;

        while (true) {
            String eingabe = scn.next();

            if (eingabe.equals(".")) {
                break;
            }

            if (rat == null) {
                int zaehl = Integer.parseInt(eingabe);
                int nenn = scn.nextInt();
                rat = new Rational(zaehl, nenn);
            } else {
                char operator = eingabe.charAt(0);
                int zaehl = scn.nextInt();
                int nenn = scn.nextInt();
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
        if (rat != null) {
            System.out.println(rat);
        }
        scn.close();
    }
}
