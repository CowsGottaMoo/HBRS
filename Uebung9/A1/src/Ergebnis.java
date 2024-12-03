
public class Ergebnis {

    float note;
    int punkte;
    Student s;

    public Ergebnis(Student s, float note, int punkte) {
        this.s = s;
        this.note = note;
        this.punkte = punkte;
    }

    public String toString() {
        return s + " Note: " + note + " Punkte: " + punkte;
    }
}
