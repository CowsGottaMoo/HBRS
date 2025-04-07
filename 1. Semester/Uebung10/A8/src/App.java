
public class App {

    public static void main(String[] args) {
        System.out.println("Anzahl Fahrzeugen: " + Fahrzeug.getAnzahl());
        Fahrzeug f1 = new Fahrzeug(2, 1);
        Kraftfahrzeug k1 = new Kraftfahrzeug(4, 5, 122);
        System.out.println(f1);
        System.out.println(k1);
        System.out.println("Anzahl Fahrzeugen: " + Fahrzeug.getAnzahl());
        System.out.println("Anzahl Kraftfahrzeugen: " + Kraftfahrzeug.getAnzahl());
    }
}
