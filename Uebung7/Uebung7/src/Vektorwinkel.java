
public class Vektorwinkel {

    public static void main(String[] args) {
        /*
        double[] vektorA = {1, 1, 1, 1};
        double[] vektorB = {1, 2, 3, 4};
        System.out.println("Fuer die beiden Vektoren (1,1,1,1) und (1,2,3,4) ist der Winkel " + winkel(vektorA, vektorB) + " Grad");
         */
    }

    public static double winkel(double[] a, double[] b) {
        if (a.length != b.length) {
            System.out.println("Die Vektoren müssen die gleiche Länge haben.");
            return 0;
        }

        double skalarprodukt = skalarprodukt(a, b);
        double normA = norm(a);
        double normB = norm(b);

        double cosTheta = skalarprodukt / (normA * normB);
        double theta = Math.acos(cosTheta);

        return radToGrad(theta);
    }

    public static double skalarprodukt(double[] a, double[] b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static double norm(double[] a) {
        return Math.sqrt(skalarprodukt(a, a));
    }

    public static double radToGrad(double rad) {
        return rad * 180 / Math.PI;
    }
}
