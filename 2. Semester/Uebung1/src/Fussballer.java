public class Fussballer extends Sportler {


    //github test
    private String verein;
    private boolean linksfuss;

    public Fussballer(String n, int g, int gr, double ge, String v, boolean lf) {
        super(n, g, gr, ge);
        this.verein = v;
        this.linksfuss = lf;
    }

    @Override
    public String info() {
        return this.verein;
    }

    
}
