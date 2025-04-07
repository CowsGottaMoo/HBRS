
public class Student {

    String nachName;
    String vorName;
    int matrNr;

    public Student(String vorName, String nachName, int matrNr) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.matrNr = matrNr;
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
}
