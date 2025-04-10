public class Kreis extends GeoObjekt2D{
    private Punkt2D mittelpunkt;
    private double radius;

    public Kreis(Punkt2D mittelpunkt, double radius){
        this.mittelpunkt = mittelpunkt;
        if(radius < 0){
            this.radius = Math.abs(radius);
        } else{
            this.radius = radius;
        }
    }

    public Kreis() {
        super();
    }

    @Override
    public double umfang() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double flaeche() {
        return 0;
    }

    public Punkt2D mittelpunkt(){
        return mittelpunkt;
    }

    public double radius(){
        return radius;
    }
}
