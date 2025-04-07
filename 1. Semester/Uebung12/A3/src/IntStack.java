
public class IntStack {

    static int belegt;

    int maximalGroesse;
    int sp;
    int[] a;

    IntStack(int n) {
        maximalGroesse = n;
        a = new int[n];
        sp = -1;
    }

    public boolean isemptystack() {
        return sp == -1;
    }

    public void push(int x) {
        try {
            if (sp + 1 >= a.length) {
                throw new StackOverflowException("Stack is full");
            }
            a[++sp] = x;
        } catch (StackOverflowException e) {
            System.err.println(e.getMessage());
        }
    }

    public int pop() {
        try {
            if (isemptystack()) {
                throw new EmptyStackException("Stack is empty");
            }
            return a[sp--];
        } catch (EmptyStackException e) {
            System.err.println(e.getMessage());
            return -1;
        }
    }

    public static int gibSpeicherverbrauch() {
        return belegt;
    }

    public static void main(String[] args) {
        IntStack s1 = new IntStack(5);
        IntStack s2 = new IntStack(10);

        for (int i = 0; i < 5; i++) {
            s1.push(i);
            s2.push(i);
        }

        System.out.println(s1.isemptystack());

        for (int i = 0; i <= 5; i++) {
            System.out.println(s1.pop());
            s1.pop();
            s2.pop();
        }
        System.out.println(s1.isemptystack());
    }
}
