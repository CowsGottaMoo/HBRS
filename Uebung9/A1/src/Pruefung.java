
public class Pruefung {

    String name;
    String datum;
    int creditanzahl;
    Ergebnis e;
    Student s;

    public Pruefung(String name, String datum, int creditanzahl) {
        this.name = name;
        this.datum = datum;
        this.creditanzahl = creditanzahl;
    }

    public void neuesErgebnis(Ergebnis e) {
        this.e = e;
    }

    public String toString() {
        return "Pruefung " + name + " vom " + datum + " mit " + creditanzahl + " Credits\n";
    }

}
