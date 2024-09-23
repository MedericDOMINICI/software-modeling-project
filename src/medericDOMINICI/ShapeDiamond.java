package medericDOMINICI;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
	public double a = 2.0;
	private double b = 2.0;
	private DecimalFormat df2 = new DecimalFormat("#.##");
	private String color = "No color";
	
	public ShapeDiamond(){}
	public ShapeDiamond(String color) {
		this.color=color;
	}
	public ShapeDiamond(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public ShapeDiamond(double a, double b, String color) {
		this.a = a;
		this.b = b;
		this.color=color;
	}
	
	public double calculateArea() {
		return (this.a*this.b)/2;
	}
	
	public double calculatePerimeter() {
		return(2*this.a + 2*this.b);
	}
	
	public void drawShape() {
		System.out.println("This is a diamond shape with area: "+this.calculateArea()+" and perimeter: "+this.calculatePerimeter()+". Color: "+this.getColor());
	}
	
	public String getColor() {
		if (this.color != "No color") {
			return color;
		}
		else {
			return "The shape is not colored";
		}
	}
	
	public String setColor(String color) {
		return this.setColor(color);
	}
	
}
