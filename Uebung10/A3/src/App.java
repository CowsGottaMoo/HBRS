
public class App {

    public static void main(String[] args) {
        Segelflugzeug sf = new Segelflugzeug(17.0);
        System.out.println(sf);

        Passagierflugzeug pg = new Passagierflugzeug(10.97, 4, 1.3);
        System.out.println(pg);

        A380 a380 = new A380();
        System.out.println(a380);

        System.out.println("Anzahl Flugzeuge: " + Flugzeug.getCounter());
        System.out.println("Anzahl Segelflugzeuge: " + Segelflugzeug.getCounter());
        System.out.println("Anzahl Passagierflugzeuge: " + Passagierflugzeug.getCounter());
        System.out.println("Anzahl A380: " + A380.getCounter());
    }
}
