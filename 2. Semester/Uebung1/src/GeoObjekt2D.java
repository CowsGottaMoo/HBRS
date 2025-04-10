public abstract class GeoObjekt2D extends GeoObjekt implements Skalierbar{
    @Override
    public void multiply(double factor) {
        if(factor < 0){
            factor = Math.abs(factor);
        } else{
            factor = factor;
        }
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
