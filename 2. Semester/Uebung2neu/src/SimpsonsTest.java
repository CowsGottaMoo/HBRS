public class SimpsonsTest {

    public static void main(String[] args){
        Kind abe = new Kind("Abe Simpson", 1925);
        Kind mona = new Kind("Mona Simpson", 1940);
        Kind clancy = new Kind("Clancy Simpson", 1935);
        Kind jackie = new Kind("Jackie Bouvier", 1942);
        Kind herb = new Kind("Herbert Powell", 1953);
        Kind homer = new Kind("Homer Simpson", 1961);
        Kind marge = new Kind("Marge Simpson", 1958);
        Kind selma = new Kind("Selma Bouvier", 1960);
        Kind patty = new Kind("Patty Bouvier", 1960);
        Kind bart = new Kind("Bart Simpson", 1984);
        Kind lisa = new Kind("Lisa Simpson", 1986);
        Kind maggie = new Kind("Maggie Simpson", 1989);

        herb.setEltern(abe, new Person("Unknown", 0));
        homer.setEltern(abe, mona);
        marge.setEltern(clancy, jackie);
        selma.setEltern(clancy, jackie);
        patty.setEltern(clancy, jackie);
        bart.setEltern(homer, marge);
        lisa.setEltern(homer, marge);
        maggie.setEltern(homer, marge);

        if(lisa.geschwister(lisa, bart)){
            System.out.println("Lisa und Bart sind Geschwister");
        } else {
            System.out.println("Lisa und Bart sind keine Geschwister");
        }

        if(herb.geschwister(herb, abe)){
            System.out.println("Herb und Abe sind Geschwister");
        } else {
            System.out.println("Herb und Abe sind keine Geschwister");
        }

        System.out.println("dAlter bart: " + dAlter(family(bart)));
    }

    public static Paar<Kind, Paar> family(Kind k){
        Paar<Person, Person> eltern = k.eltern();
        Paar<Kind, Paar> x = new Paar<>(k, eltern);
        return x;
    }

    public static int dAlter(Paar<Kind, Paar> x){
        Person vater = (Person) x.zweites().erstes();
        Person mutter = (Person) x.zweites().zweites();
        int a = x.erstes().gebJahr() - vater.gebJahr();
        int b = x.erstes().gebJahr() - mutter.gebJahr();
        return (a+b)/2;
    }
}
