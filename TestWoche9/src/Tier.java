
public class Tier {

    int nummer;
    String name;
    Gehege gehege;

    public Tier(int nummer1, String name1) {
        nummer = nummer1;
        name = name1;
        //gehege = gehege1;
    }

    public int getNumme() {
        return nummer;
    }

    public String getName() {
        return name;
    }

    public Gehege getGehege() {
        return gehege;
    }
}
