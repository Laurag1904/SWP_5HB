package RefectorMe;

public class Rectangle extends Geometry {
	/*
	 * hohe und breite hinzugefügt, da man daraus dann ein einheits Rechteck hat
	 */

	private int id = -1;
	private final double width;
	private final double height;

	
	protected Rectangle(int id, double width, double height, boolean filled, String color) throws IdException {
		super(id, width, height, filled, color);

		if (width < 0 || height < 0) {
			System.out.println("Value less than zero not allowed!");
			width = 2; 
			height = 4;
		}
		this.id = id;
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}

