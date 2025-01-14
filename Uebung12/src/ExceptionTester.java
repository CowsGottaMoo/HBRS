public class ExceptionTester {
    public void testen1() {
        throw new Fehler1("Fehler1 ist aufgetreten");
    }

    public void testen2() throws Fehler2 {
        throw new Fehler2("Fehler2 ist aufgetreten");
    }
}