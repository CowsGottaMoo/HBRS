public class Vektor2D extends Punkt2D implements Messbar, Addierbar {
    @Override
    public Addierbar add( Addierbar a) {
        return null;
    }

    @Override
    public double laenge() {
        return 0;
    }

    @Override
    public void multiply(double factor) {

    }

    @Override
    public void resize() {

    }

    public Vektor2D(double x, double y) {
        super(x, y);
    }

    public Vektor2D(Punkt2D punkt) {
        super(punkt.x(), punkt.y());
    }

    public Vektor2D(Punkt2D p1, Punkt2D p2) {
        super(p1.x(), p2.x());
    }

    public Vektor2D() {
        super();
    }


}
