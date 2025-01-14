
public class Stack {

    private Object[] elemente;
    private int groesse;
    private int maxGroesse;

    public Stack(int maxGroesse) {
        this.groesse = 0;
        this.maxGroesse = maxGroesse;
        this.elemente = new Object[maxGroesse];
    }

    public void push(Object obj) {
        if (groesse < maxGroesse) {
            elemente[groesse++] = obj;
        } else {
            System.out.println("Fehler: Stack ist voll");
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Fehler: Stack ist leer");
        }
        Object obj = elemente[--groesse];
        elemente[groesse] = null;
        return obj;
    }

    public boolean isEmpty() {
        return groesse == 0;
    }
}
