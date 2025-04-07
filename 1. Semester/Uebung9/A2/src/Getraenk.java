
public class Getraenk {

    String name;
    int abgabemenge; // in ml
    int preis; //in cent
    int freigabealter;

    public Getraenk(String name, int abgabemenge, int preis, int freigabealter) {
        this.name = name;
        this.abgabemenge = abgabemenge;
        this.preis = preis;
        this.freigabealter = freigabealter;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Menge: " + abgabemenge + ", Preis: " + preis + ", Altersfreigabe: " + freigabealter;
    }

    public String getName() {
        return name;
    }
}
