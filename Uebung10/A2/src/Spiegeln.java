
public class Spiegeln {

    public static String spiegeln(String str) {
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push("" + str.charAt(i));
        }
        String ergebnis = "";
        while (!stack.isEmpty()) {
            ergebnis = ergebnis + stack.pop();
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        String s = "hallo";
        System.out.println(s + " gespiegelt ist " + spiegeln(s));
    }
}
