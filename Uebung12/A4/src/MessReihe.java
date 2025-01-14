
public class MessReihe {

    private MessDatum[] messungen;
    private int n;
    private int counter;
    MessBereich mbu = new MessBereich(0, 12000, 8000);
    MessBereich mbt = new MessBereich(0, 200, 150);
    MessBereich mbd = new MessBereich(0, 6, 5);

    public MessReihe(int n) {
        this.n = n;
        messungen = new MessDatum[n];
        counter = 0;
    }

    public void neueMessung(int u, double t, double d) throws IllegalValue, CriticalValue, TooMuchData {
        if (counter < n) {
            mbu.pruefen(u);
            mbt.pruefen(t);
            mbd.pruefen(d);
            MessDatum messDatum = new MessDatum(u, t, d);
            messungen[counter] = messDatum;
            counter++;
        } else {
            throw new TooMuchData("TooMuchData, Zu viele Daten");
        }
    }

    public double[] ermittleMittelwerte() {
        double[] mittelwerte = new double[3];
        double summeU = 0;
        double summeT = 0;
        double summeD = 0;
        for (int i = 0; i < counter; i++) {
            summeU += messungen[i].getU();
            summeT += messungen[i].getT();
            summeD += messungen[i].getD();
        }
        mittelwerte[0] = summeU / n;
        mittelwerte[1] = summeT / n;
        mittelwerte[2] = summeD / n;
        return mittelwerte;
    }
}
