public class Paar<E, Z> {
    private E erstes;
    private Z zweites;

    public Paar(E erstes, Z zweites) {
        this.erstes = erstes;
        this.zweites = zweites;
    }

    public E erstes() {
        return erstes;
    }

    public Z zweites() {
        return zweites;
    }

    public void setErstes(E e) {
        this.erstes = e;
    }

    public void setZweites(Z z) {
        this.zweites = z;
    }

    @Override
    public String toString() {
        return "(" + erstes + ", " + zweites + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paar<?, ?> paar = (Paar<?, ?>) obj;
        return erstes.equals(paar.erstes) && zweites.equals(paar.zweites);
    }
}
