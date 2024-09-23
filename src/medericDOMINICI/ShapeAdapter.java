package medericDOMINICI;

public class ShapeAdapter extends Visibility implements ShapeBasic {
	
	private ShapeSpecial SC;
	
	public ShapeAdapter(boolean inBackground, ShapeSpecial SC) {
		super(inBackground);
		this.SC = SC;
	}
	
	public void draw() {
		SC.drawShape();
	}
	
	public void grow() {
		System.out.println(this.printText()+", cannot grow");
	}
	
	public String printText() {
		return "TO BE DONE !!!!!!!!!!!!!!!!!!!!!!!!!!!!";
	}
}
