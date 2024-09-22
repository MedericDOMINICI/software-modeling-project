package medericDOMINICI;

public class ShapeDrawer extends Drawing<ShapeBasic> {
	public ShapeDrawer() {};
	
	public void draw() {
		if (this.getBasicShapes().isEmpty()) {
			System.out.println("Drawing is empty");	
		} else {
			for(int i=0; i<this.getBasicShapes().size(); i++ ) {
				this.getBasicShapes().get(i).draw();
			}
		}
	}
	
	public void grow() {
		if (this.getBasicShapes().isEmpty()) {
			System.out.println("Drawing is empty");	
		} else {
			for(int i=0; i<this.getBasicShapes().size(); i++ ) {
				this.getBasicShapes().get(i).grow();
			}
		}
	}
	
	public void showVisibility() {
		if (this.getBasicShapes().isEmpty()) {
			System.out.println("Drawing is empty");	
		} else {
			for(int i=1; i<=this.getBasicShapes().size(); i++ ) {
				if(this.getBasicShapes().get(i-1).isVisible()) {
					System.out.println((i)+") shape is visible: "+this.getBasicShapes().get(i-1).printText());
				}
				else {
					System.out.println((i)+") shape is in the background: "+this.getBasicShapes().get(i-1).printText());
				}
			}
			System.out.println("Total number of shapes: "+this.getBasicShapes().size());
		}
	}
}
