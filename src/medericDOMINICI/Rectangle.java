package medericDOMINICI;

public class Rectangle extends Visibility implements ShapeBasic {
	
	public Rectangle(boolean inBackground) {
		super(inBackground);
	}
	
	public void draw() {
		System.out.println("This is a rectangle");
	}
	
	public void grow() {
		System.out.println("Growing the size of the rectangle");
	}
	
	public String printText() {
		return "Rectangle";
	}
}
