import java.util.Scanner;

public class aufgabe6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x = scn.nextDouble();
        double y = scn.nextDouble();
        double z = scn.nextDouble();
        double yminusx = Math.abs(y - x);
        double a = Math.random() * (y - x + 1) + x;
        double b = Math.random() * (y - x + 1) + x;
        double aminusb = Math.abs(a - b);
        scn.close();

        if (x > y || z < 0 || yminusx < z) {
            System.out.println("error eingaben ungültig");
            return;
        }

        while (a == b || aminusb >= z) {
            a = Math.random() * (y - x + 1) + x;
            b = Math.random() * (y - x + 1) + x;
            aminusb = Math.abs(a - b);
        }
        System.out.println(a + "\n" + b);

    }

}
