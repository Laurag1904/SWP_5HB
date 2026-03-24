package RefectorMe;

public abstract class Geometry implements Comparable<Geometry> {
    private final int id;
    private final boolean filled;
    private final String color;

    /**
     * Änderungen: klasse abstract gesetzt, width und height entfernt
     */
    /**
     * Konstruktor für die Basisdaten jeder Form.
     * @param id Eindeutige Identifikationsnummer.
     * @param filled Gibt an, ob die Form ausgefüllt ist.
     * @param color Die Farbe der Form als String.
     * @throws IdException wenn die ID ungültig (negativ) ist.
     */
    protected Geometry(int id, boolean filled, String color) throws IdException {
        if (id < 0) {
            throw new IdException("ID muss positiv sein!");
        }
        this.id = id;
        this.filled = filled;
        this.color = color;
    }

    /** Berechnet den Flächeninhalt der spezifischen Form. */
    public abstract double calculateArea();

    /** Berechnet den Umfang der spezifischen Form. */
    public abstract double getPerimeter();

    /**
     * Vergleicht zwei Geometrien anhand ihrer Fläche.
     * Nutzt Double.compare für Typsicherheit bei Fließkommazahlen.
     */
    @Override
    public int compareTo(Geometry other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    // Getter (final, da sie nicht überschrieben werden müssen)
    public int getId() { return id; }
    public boolean isFilled() { return filled; }
    public String getColor() { return color; }
}