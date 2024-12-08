
public class PolynomTest {

    public static void main(String[] args) {
        double[] koeffizienten = {3, 2, 1};
        Polynom p = new Polynom(koeffizienten);

        System.out.println(p);

        double wert = p.auswerten(2);
        System.out.println(wert);

        System.out.println(Polynom.getAnzahl());
    }
}
