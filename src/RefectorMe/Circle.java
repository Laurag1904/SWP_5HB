package RefectorMe;

/**
 * Repräsentiert einen Kreis.
 */
public class Circle extends Geometry {
    private final double radius;

    public Circle(int id, double radius, boolean filled, String color) throws IdException {
        super(id, filled, color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius muss positiv sein.");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() { 
        return Math.PI * Math.pow(radius, 2); 
    }

    @Override
    public double getPerimeter() { 
        return 2 * Math.PI * radius; 
    }

    /**
     * Berechnet den Durchmesser.
     * Refactoring: Logik korrigiert (war vorher Umfangsberechnung).
     */
    public double getDiameter() { 
        return 2 * radius; 
    }
}