/**
 * 
 * @author sw
 *
 */
 
public class Person {
	
	private String name;
	private int gebJahr;
	
	public Person(String n, int g) {
		this.name = n;
		this.gebJahr = g;
	}
	
	public String name() {
		return this.name;
	}
	
	public int gebJahr() {
		return this.gebJahr;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.gebJahr + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.gebJahr == p.gebJahr;
		}
		return false;
	}
	
}
