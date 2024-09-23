package medericDOMINICI;

public class AdapterMain {
	public AdapterMain() {};
	
	public static void main(String[] args) {
		
		// Create the drawing
		ShapeDrawer drawing = new ShapeDrawer();
		
		// Creating shapes
		Rectangle rect1 = new Rectangle(false);
		Rectangle rect2 = new Rectangle(true);
		Circle circle1 = new Circle(false);
		Circle circle2 = new Circle(true);
		Rectangle rect3 = new Rectangle(false);
		Triangle tri1 = new Triangle("Other color");
		ShapeDiamond SH1 = new ShapeDiamond("Purple");
		ShapeDiamond SH2= new ShapeDiamond("sommmethingElse");
		ShapeDiamond SH3 = new ShapeDiamond(4.0,4.0,"Purple");
		Triangle tri2 = new Triangle(6.0,6.0,6.0, "Blue");
		ShapeDiamond SH4 = new ShapeDiamond(1.0,1.0,"Green");
		BrushStroke BS1 = new BrushStroke(false);
		BrushStroke BS2 = new BrushStroke(false);
		BS2.setColor("someColor");
		BrushStroke BS3 = new BrushStroke(false);
		BS3.setColor("RED");
		
		//Drawing
		drawing.addBasicShape(rect1);
		drawing.addBasicShape(rect2);
		drawing.addBasicShape(circle1);
		drawing.addBasicShape(circle2);
		drawing.addBasicShape(rect3);
		
		ShapeAdapter tri1Adapter = new ShapeAdapter(false, tri1);
		drawing.addBasicShape(tri1Adapter);
		
		ShapeAdapter SH1Adapter = new ShapeAdapter(false, SH1);
		drawing.addBasicShape(SH1Adapter);
		
		ShapeAdapter SH2Adapter = new ShapeAdapter(false, SH2);
		drawing.addBasicShape(SH2Adapter);
		
		ShapeAdapter SH3Adapter = new ShapeAdapter(false, SH3);
		drawing.addBasicShape(SH3Adapter);
		
		ShapeAdapter tri2Adapter = new ShapeAdapter(false, tri2);
		drawing.addBasicShape(tri2Adapter);
		
		ShapeAdapter SH4Adapter = new ShapeAdapter(false, SH4);
		drawing.addBasicShape(SH4Adapter);
		
		drawing.addBasicShape(BS1);
		drawing.addBasicShape(BS2);
		drawing.addBasicShape(BS3);
		
		drawing.draw();
		drawing.grow();		
		drawing.showVisibility();

	}
}
