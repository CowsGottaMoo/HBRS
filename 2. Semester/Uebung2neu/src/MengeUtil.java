public class MengeUtil<T> extends MengeLimited<T> {
    public static <T> Menge<T> merge(Menge<T> a, Menge<T> b) {
        if (a.isEmpty() || b.isEmpty()) {
            return a;
        }

        while (!b.isEmpty()) {
            T tmp = b.get();
            a.insert(tmp);
            b.delete(tmp);
        }
        return a;
    }

}
