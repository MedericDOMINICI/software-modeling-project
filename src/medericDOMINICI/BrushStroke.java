package medericDOMINICI;

import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {

	private int thickness;
	private String color = "Yellow";
	
	public BrushStroke(boolean inBackground) {
		super(inBackground);
		
		Random rnd = new Random();
		this.thickness = rnd.nextInt(10)+1;
	}
	
	public void draw() {
		System.out.println("Brush strokes with thickness "+this.thickness);
	}
	
	public void grow() {
		System.out.println("Adding some color " + this.getColor());
	}
	
	public String printText() {
		return "Brush Stroke";
	}
	
	public String getColor() {
		// return this.getColor();
		return "TO BE DONE";
	}
	
	public String setColor(String color) {
		//return this.setColor(color);
		return "TO BE DONE";
	}
	
}
