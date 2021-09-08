package rectircle;

public class Main {

	public static void main(String[] args) {
		int shapeNums = 3;
		
		//I'm not sure if your instructions meant to do something like "Rectangle box1 = new Rectangle(4,5), box2 = new Rectangle(5.7, 8.1)",
		//but this made using a for loop more complex and creating additional lines of code, having to create the array separately and then
		//copying objects into the object array. Also I added a third box to show the results of the 0-arg constructor.
		Rectangle[] boxes;
		boxes = new Rectangle[shapeNums];
		boxes[0] = new Rectangle(); boxes[1] = new Rectangle(4,5); boxes[2] = new Rectangle(5.7, 8.1);
		
		
		for(int i = 0; i < shapeNums; i++) {
			System.out.println("Rectangle with width " + boxes[i].getWidth() + " and length " + boxes[i].getLength() + " has an area of " + boxes[i].computeArea() + ".");
		}
		
		Circle[] circles;
		circles = new Circle[shapeNums];
		circles[0] = new Circle(); circles[1] = new Circle(3.2); circles[2] = new Circle(4.0);
		
		for(int i = 0; i < shapeNums; i++) {
			System.out.println("Circle with radius " + circles[i].getRadius() + " has an area of " + circles[i].computeArea() + ".");
		}
		
		


	}

}
