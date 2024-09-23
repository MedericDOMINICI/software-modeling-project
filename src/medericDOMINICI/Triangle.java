package medericDOMINICI;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {
	private double a = 3.0;
	private double b = 3.0;
	private double c = 3.0;
	private DecimalFormat df2 = new DecimalFormat("#.##");
	private String color = "No color";
	
	public Triangle() {};
	public Triangle(String color) {
		this.color = color;
	}
	public Triangle(double a, double b, double c, String color) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.color = color;
	}
	
	public double calculatePerimeter() {
		return this.a+this.b+this.c;
	}
	
	public double calculateArea() {
		double p = this.calculatePerimeter();
		return (p*(p-this.a)*(p-this.b)*(p-this.c));
	}
	
	public void drawShape() {
		System.out.println("This is a triangle with area: "+this.calculateArea()+" and perimeter: "+this.calculatePerimeter()+". Color: "+this.getColor());
	}
	
	public String getColor() {
		return this.color;
	}
}
