package rectircle;

public class Circle {
	private double radius;
	
	public Circle() {}
	public Circle(double r) {
		radius = r;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		double result;
		result = Math.PI * Math.pow(radius, 2);
		return result;
	}

}
