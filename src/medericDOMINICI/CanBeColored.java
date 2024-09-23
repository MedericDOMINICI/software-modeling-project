package medericDOMINICI;

public interface CanBeColored {
	
	default String setColor(String color) {
		
		if (color == null) {
            return "No color";
        }
        
        switch (color.toLowerCase()) {
            case "blue":
                return "Blue";
            case "green":
                return "Green";
            case "red":
                return "Red";
            case "yellow":
                return "Yellow";
            default:
                return "No color";
        }
	}
	
	public abstract String getColor();
}
