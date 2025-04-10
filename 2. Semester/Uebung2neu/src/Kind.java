public class Kind extends Person{

    private Paar<Person, Person> eltern;
    public Kind(String n, int g) {
        super(n, g);
    }

    public void setEltern(Person v, Person m) {
        this.eltern = new Paar<>(v, m);
    }

    public Paar<Person, Person> eltern() {
        return this.eltern;
    }

    public static boolean geschwister(Kind a, Kind b){
        if (a.eltern() == null && b.eltern() == null) { return false; }
        if(a.eltern().equals(b.eltern())){
            return true;
        } else {
            return false;
        }
    }
}
