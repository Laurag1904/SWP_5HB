package RefectorMe;

/**
 * Main-Klasse zum Testen der Refactoring-Ergebnisse.
 */
public class Drawlt {
    public static void main(String[] args) {
        try {
            // Objekte erstellen
            Geometry rect = new Rectangle(1, 2.0, 6.0, true, "grey");
            Geometry circ = new Circle(2, 3.0, false, "red");
            Geometry sq   = new Square(3, 4.0, true, "blue");

            // Collection nutzen
            GeometryCollection<Geometry> shapes = new GeometryCollection<>();
            shapes.add(rect);
            shapes.add(circ);
            shapes.add(sq);

            // Testzugriff
            System.out.println("Fläche Kreis (ID 2): " + shapes.getById(2).calculateArea());
            System.out.println("Farbe Quadrat (ID 3): " + shapes.getById(3).getColor());

        } catch (IdException | InvalidAccessException e) {
            System.err.println("Fehler im Programmablauf: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ungültige Parameter: " + e.getMessage());
        }
    }
}