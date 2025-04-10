public class Strecke extends GeoObjekt implements Messbar {

    private Punkt2D anfP;
    private Punkt2D endP;

    @Override
    public Punkt2D position() {
        return anfP;
    }

    @Override
    public void moveTo(Punkt2D p) {
        // ?
    }

    public Punkt2D anfP() {
        return anfP;
    }

    public Punkt2D endP() {
        return endP;
    }

    @Override
    public double laenge() {
        return anfP.abstand(endP);
    }

    public Strecke(Punkt2D anfP, Punkt2D endP) {
        this.anfP = anfP;
        this.endP = endP;
    }
}
