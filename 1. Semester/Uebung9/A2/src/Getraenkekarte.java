
public class Getraenkekarte {

    Getraenk[] gFeld;
    int i = 0;
    int limit = 1;

    public Getraenkekarte() {
        gFeld = new Getraenk[limit];
    }

    public void neuesGetraenk(Getraenk getraenk) {
        vergrossern();
        gFeld[i] = getraenk;
        i++;
    }

    private void vergrossern() {
        limit++;
        Getraenk[] neu = new Getraenk[limit];
        for (int j = 0; j < i; j++) {
            neu[j] = gFeld[j];
        }
        gFeld = neu;
    }

    public Getraenk suchen(String string) {
        for (int j = 0; j < i; j++) {
            if (gFeld[j].getName().equals(string)) {
                return gFeld[j];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String r = "";
        for (int k = 0; k < gFeld.length; k++) {
            if (gFeld[k] != null) { // Check if the element is not null
                r = r + gFeld[k].toString() + "\n";
            }
        }
        return r;
    }

}
