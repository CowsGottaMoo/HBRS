// Main.java
public class Main {
    public static void main(String[] args) {
        ExceptionTester tester = new ExceptionTester();
        
        try {
            tester.testen1();
        } catch (Fehler1 e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        try {
            tester.testen2();
        } catch (Fehler2 e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }
}