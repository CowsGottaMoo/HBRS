/**
 * 
 * @author sw
 *
 */

public class Punkt2D {
	/*
	 * Version U01
	 */

	private double x;
	private double y;

	public Punkt2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punkt2D() {
		this(0.0, 0.0);
	}

	public double x() {
		return x;
	}

	public double y() {
		return y;
	}

	public void setX(double neu) {
		this.x = neu;
	}

	public void setY(double neu) {
		this.y = neu;
	}

	public double abstand(Punkt2D p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
