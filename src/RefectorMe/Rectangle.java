package RefectorMe;

/**
 * Repr‰sentiert ein Rechteck.
 * Refactoring: Kapselung der Maﬂe (private final) und Validierung im Konstruktor.
 */
public class Rectangle extends Geometry {
    private final double width;
    private final double height;

    public Rectangle(int id, double width, double height, boolean filled, String color) throws IdException {
        super(id, filled, color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Breite und Hˆhe m¸ssen > 0 sein.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() { return width * height; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }
}