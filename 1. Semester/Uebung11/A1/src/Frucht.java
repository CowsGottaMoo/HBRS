
abstract class Frucht {

    private int gewicht;
    private static int anzahl = 0;

    protected Frucht(int gewicht) {
        this.gewicht = gewicht;
        anzahl++;
    }
}
