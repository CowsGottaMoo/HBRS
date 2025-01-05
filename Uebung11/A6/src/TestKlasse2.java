
public class TestKlasse2 {

    public static void main(String[] args) {
        System.out.println(gibZahl(4711));
    }

    public static String gibZahl(int wert) {
        ZahlFunktionalitaet z = new ZahlKlasse(wert * 2) {
        };
        return z.toString();
    }
}
