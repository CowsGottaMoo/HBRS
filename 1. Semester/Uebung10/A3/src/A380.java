
public class A380 extends Passagierflugzeug {

    private static int counter;

    public A380() {
        super(79.8, 558, 1280);
        counter++;
    }

    public String toString() {
        return super.toString() + " A380";
    }

    public static int getCounter() {
        return counter;
    }
}
