package medericDOMINICI;

public abstract class Visibility {
	private boolean inBackground = false;
	
	public Visibility(boolean inBackground) {
		this.inBackground = inBackground;
	}
	
	public void changeVisibility() {
		this.inBackground = !this.inBackground; 
	};
	public boolean isVisible() {
		return this.inBackground;
	};
}