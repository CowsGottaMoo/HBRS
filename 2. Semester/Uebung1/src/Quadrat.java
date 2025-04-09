public class Quadrat extends GeoObjekt2D{
    private Punkt2D eckeLu;
    private Punkt2D eckeRo;
    private double kantenlaenge;

    public Quadrat(Punkt2D lu, double kantenlaenge){
        this.eckeLu = lu;
        if(kantenlaenge < 0){
            this.kantenlaenge = Math.abs(kantenlaenge);
        } else{
            this.kantenlaenge = kantenlaenge;
        }
        this.eckeRo = new Punkt2D(lu.x() + kantenlaenge, lu.y() + kantenlaenge);
    }

    @Override
    public double umfang() {
        return 0;
    }

    @Override
    public double flaeche() {
        return kantenlaenge * kantenlaenge;
    }

    public Punkt2D eckeLU(){
        return eckeLu;
    }

    public Punkt2D eckeRO(){
        return eckeRo;
    }

    public double kantenl(){
        return kantenlaenge;
    }
}
