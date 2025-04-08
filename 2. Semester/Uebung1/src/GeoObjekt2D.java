public abstract class GeoObjekt2D extends GeoObjekt implements Skalierbar{
    @Override
    public void multiply(double factor) {

    }

    @Override
    public void resize() {

    }

    @Override
    public Punkt2D position() {
        return null;
    }

    @Override
    public void moveTo(Punkt2D p) {

    }

    public abstract double umfang();
    public abstract double flaeche();

}
