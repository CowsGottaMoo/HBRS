
public class App {

    public static void main(String[] args) throws Exception {
        Uhr u = new Uhr(23, 59, 59);
        System.out.println(u);
        u.tick();
        System.out.println(u);

        Sportuhr s = new Sportuhr();
        s.tick();
        System.out.println(s);
        s.setHerzfrequenz(91);
        s.wechselAnzeige();
        System.out.println(s);
    }
}
