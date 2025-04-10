public class MengeUtil<T> implements Menge<Object> {
    public static <T> Menge<T> merge(Menge<T> a, Menge<T> b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a;
        }
        return a;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void insert(Object e) {

    }

    @Override
    public void delete(Object e) {

    }

    @Override
    public boolean contains(Object e) {
        return false;
    }
}
