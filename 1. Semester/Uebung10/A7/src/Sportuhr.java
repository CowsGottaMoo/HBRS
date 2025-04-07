
public class Sportuhr extends Uhr {

    private int herzfrequenz;
    private boolean istHerzMonitor;

    public Sportuhr() {
        super(0, 0, 0);
        this.istHerzMonitor = false;
    }

    public void setHerzfrequenz(int wert) {
        herzfrequenz = wert;
    }

    public void wechselAnzeige() {
        if (istHerzMonitor == true) {
            istHerzMonitor = false;
        } else if (istHerzMonitor == false) {
            istHerzMonitor = true;
        }
    }

    public String toString() {
        if (istHerzMonitor == true) {
            return "Herzfrequenz: " + herzfrequenz;
        } else {
            return "Uhrzeit: " + super.toString();
        }
    }
}
