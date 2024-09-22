package medericDOMINICI;

public class Circle extends Visibility implements ShapeBasic {
	
	public Circle(boolean inBackground) {
		super(inBackground);
	}
	
	public void draw() {
		System.out.println("This is a circle");
	}
	
	public void grow() {
		System.out.println("Growing the size of the circle");
	}
	
	public String printText() {
		return "Circle";
	}
}
