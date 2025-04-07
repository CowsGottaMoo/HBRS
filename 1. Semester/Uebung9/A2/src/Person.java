
public class Person {

    String vorname;
    int alter;

    public Person(String vorname, int alter) {
        this.vorname = vorname;
        this.alter = alter;
    }

    public String toString() {
        return vorname + " (" + alter + ")";
    }
}
