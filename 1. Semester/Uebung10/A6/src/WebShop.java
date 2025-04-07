
public class WebShop {

    private Artikel[] inventar = new Artikel[1];
    private int counter;

    public WebShop() {
        this.counter = 0;
    }

    public void vergroessern() {
        Artikel[] temp = new Artikel[inventar.length + 1];
        for (int i = 0; i < inventar.length; i++) {
            temp[i] = inventar[i];
        }
        inventar = temp;
    }

    public void neuerArtikel(String name, double preis, int anzahl) {
        if (counter >= inventar.length) {
            vergroessern();
        }
        inventar[counter] = new Artikel(name, preis, anzahl);
        counter++;
    }

    public Kunde neuerKunde(String vorname, String nachname) {
        return new Kunde(vorname, nachname);
    }

    public Kunde neuerKunde(String vorname, String nachname, double nachlass) {
        return new GuterKunde(vorname, nachname, nachlass);
    }

    public String bestellen(Kunde kunde, String[] artikel) {
        double nachlass;
        double gesamtpreis = 0;
        String rechnung = "";

        if (kunde instanceof GuterKunde guterkunde) {
            nachlass = guterkunde.getNachlass();
            rechnung = "Rechnung fuer unseren guten Kunden " + guterkunde.getName() + ", Preisnachlass " + guterkunde.getNachlass() * 100 + "%:" + "\n";
        } else {
            nachlass = 0;
            rechnung = "Rechnung fuer " + kunde.getName() + ":\n";
        }

        for (int i = 0; i < artikel.length; i++) {
            String artikelName = artikel[i];
            boolean gefunden = false;
            for (int j = 0; j < counter; j++) {
                if (inventar[j].getName().equals(artikelName)) {
                    gefunden = true;
                    if (inventar[j].getAnzahl() > 0) {
                        inventar[j].gekauft();
                        double artikelPreis = inventar[j].getPreis() * (1 - nachlass);
                        gesamtpreis += artikelPreis;
                        rechnung += artikelName + " : " + artikelPreis + "\n";
                    } else {
                        rechnung += artikelName + " : " + "nicht mehr vorhanden" + "\n";
                    }
                }
            }
            if (!gefunden) {
                rechnung += artikelName + " : " + "nicht gefunden" + "\n";
            }
        }
        rechnung += "Gesamtpreis : " + gesamtpreis;
        return rechnung + "\n";
    }
}
