
public class Gehege {

    int nummer;
    int maximalBelegung;
    int aktuelleBelegung;
    Tier[] bewohner;

    public Gehege(int nummer, int maximalBelegung) {
        this.nummer = nummer;
        this.maximalBelegung = maximalBelegung;
    }

    public int getNummer() {
        return nummer;
    }

    public int getMaximalBelegung() {
        return maximalBelegung;
    }

    public int getAktuelleBelegung() {
        return aktuelleBelegung;
    }

    public Tier[] getTierfeld() {
        return bewohner;
    }
}
