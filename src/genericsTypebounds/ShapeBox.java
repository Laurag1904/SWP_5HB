package genericsTypebounds;

public class ShapeBox <T extends Shape>{
	
	public ShapeBox(Circle c1) {
		// TODO Auto-generated constructor stub
	}

	public void drawShape(Shape s) {
		s.draw();
	}
	

}
