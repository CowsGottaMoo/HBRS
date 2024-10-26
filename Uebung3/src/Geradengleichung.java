
public class Geradengleichung {

    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);

        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        if (x1 != x2) {
            double a = (y2-y1) / (x2-x1);
            double b = y1-a*x1;

            System.out.println("a=" + a + " b=" + b);
        }
    }
}
