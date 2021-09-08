package rectircle;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {}
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	public double getLength() {
		return length;
	}
	public void setwidth(double w) {
		length = w;
	}
	public double getWidth() {
		return width;
	}
	
	public double computeArea() {
		double result;
		result = width * length;
		return result;
	}

}
