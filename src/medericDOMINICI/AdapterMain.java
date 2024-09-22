package medericDOMINICI;

public class AdapterMain {
	public AdapterMain() {};
	
	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(true);
		Rectangle rect2 = new Rectangle(false);
		Circle circle1 = new Circle(true);
		Circle circle2 = new Circle(false);
		Rectangle rect3 = new Rectangle(true);
		
		ShapeDrawer drawing = new ShapeDrawer();
		drawing.addBasicShape(rect1);
		drawing.addBasicShape(rect2);
		drawing.addBasicShape(circle1);
		drawing.addBasicShape(circle2);
		drawing.addBasicShape(rect3);
		
		drawing.draw();
		drawing.grow();		
		drawing.showVisibility();

	}
}
