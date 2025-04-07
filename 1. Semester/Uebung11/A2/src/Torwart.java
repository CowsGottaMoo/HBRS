
public class Torwart extends Fussballspieler implements TorSchiessen, Halten {

    public Torwart(String name) {
        super(name);
    }

    public String halten() {
        return "halten";
    }

    public String torSchiessen() {
        return "Tor schiessen";
    }

}
