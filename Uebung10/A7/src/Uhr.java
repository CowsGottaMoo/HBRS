
public class Uhr {

    private int stunde;
    private int minute;
    private int sekunde;

    public Uhr() {
        this.stunde = 0;
        this.minute = 0;
        this.sekunde = 0;
    }

    public Uhr(int stunde, int minute, int sekunde) {
        this.stunde = stunde;
        this.minute = minute;
        this.sekunde = sekunde;
    }

    public void tick() {
        sekunde++;
        if (sekunde >= 60) {
            sekunde = sekunde % 60;
            minute++;
        }
        if (minute >= 60) {
            minute = minute % 60;
            stunde++;
        }
        if (stunde >= 24) {
            stunde = stunde % 24;
        }
    }

    public String toString() {
        return stunde + ":" + minute + ":" + sekunde;
    }

}
