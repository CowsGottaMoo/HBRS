public class Aufgabe1 {
    public static void main(String[] args) {
        int result = ggT(5, 10);
        System.out.println(result);
    }

    public static int ggT(int a, int b) {
        if(b == 0){
            return a;
        } else if (a >= b) {
            return ggT(a - b, b);
        } else{
            return ggT(b, a);
        }
        
    }
}
