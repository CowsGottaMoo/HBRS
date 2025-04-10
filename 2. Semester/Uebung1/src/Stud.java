public class Stud extends Person {
    
    private static int matrNr;

    public Stud(String n, int g) {
        super(n, g);
        matrNr++;
    }

    public int MatNr(){
        return matrNr;
    }

    @Override
    public String toString(){
        return matrNr + "" + this.name();
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Stud s) {
            return this.MatNr() == s.MatNr();
        }
        return false;
    }
    
}
