
public class A4 {

    public static void main(String[] args) {
        String[] feld = {"Hello", "World"};
    }

    public static String[] verdoppeln(String[] feld) {
        String[] neu = new String[feld.length * 2];
        for (int i = 0; i < feld.length; i++) {
            neu[i] = feld[2 * i];
            neu[i + feld.length] = feld[i];
        }
        return neu;
    }
}
