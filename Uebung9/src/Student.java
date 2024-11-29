
public class Student {

    String nachName;
    String vorName;
    int matrNr;
    float note;
    int punkte;

    // Konstruktor
    public Student(String vorName, String nachName, int matrNr) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.matrNr = matrNr;
    }

    public Ergebnis(float note, int punkte){
        this.note = note;
        this.punkte = punkte;
    }



    public String toString() {
        return getName2() + " " + getName() + " (" + getMtr() + ")";
    }

    public String getName() {
        return nachName;
    }

    public String getName2() {
        return vorName;
    }

    public int getMtr() {
        return matrNr;
    }

    public static void main(String[] args) {
        Student willi = new Student("Willi", "Wichtig", 900);
        Student helga = new Student("Helga", "Eifrig", 901);

        System.out.println(willi);
        System.out.println(helga);
    }
}
