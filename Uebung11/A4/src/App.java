
public class App {

    public static void main(String[] args) throws Exception {
        Zahl z1 = new ReelleZahl(3.0);
        Zahl z2 = new ReelleZahl(5.0);
        System.out.println(z1.multiplizieren(z2));

        z1 = new KomplexeZahl(3.0, 1.0);
        z2 = new KomplexeZahl(5.0, 1.0);
        System.out.println(z1.multiplizieren(z2));
    }
}
