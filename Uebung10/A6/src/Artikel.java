
public class Artikel {

    private String name;
    private double preis;
    private int bestand;

    public Artikel(String name, double preis, int bestand) {
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
    }

    public String getName() {
        return name;
    }

    public int getAnzahl() {
        return bestand;
    }

    public double getPreis() {
        return preis;
    }

    public void gekauft() {
        bestand = bestand - 1;
    }

}
