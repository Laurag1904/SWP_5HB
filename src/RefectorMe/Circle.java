package RefectorMe;

public class Circle extends Geometry {

    private final double radius;

    /**
     * Erstellt einen Kreis.
     *
     * @param id     eindeutige ID
     * @param radius Radius (muss positiv sein)
     * @param filled Füllstatus
     * @param color  Farbe
     * @throws IdException,falls ID doppelt wird Exception geworfen
     * @throws IllegalArgumentException falls Radius ungültig da er nicht so gesehen werden darf
     */
    public Circle(int id, double radius,
                  boolean filled, String color) throws IdException {

        super(id, filled, color);

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }

        this.radius = radius;
    }

    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Berechnet den Durchmesser. geändert da man es nun besser ausrechnen kann
     * geändert das man besser erkennen kann was gemeint und was getan werden möchte/sollte 
     * man braucht Math.pi damit es auch wirklich funktioniert
     * @return Durchmesser
     */
    public double getDiameter() {
        return 2 * Math.PI * radius;
    }
}
