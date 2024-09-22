package medericDOMINICI;

import java.util.ArrayList;
import java.util.List;

public abstract class Drawing<T> {
	
	private List<T> shapes = new ArrayList<>();
	
	public Drawing (){};
	
	public void addBasicShape(T shape) {
		if(shape!=null) {
			shapes.add(shape);			
		}
	}
	
	public ArrayList<T> getBasicShapes() {
		return new ArrayList<>(shapes);
	}
	
	public abstract void draw();
	
}
