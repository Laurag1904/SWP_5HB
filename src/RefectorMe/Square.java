package RefectorMe;

/**
 * Spezialisierung eines Rechtecks.
 * Refactoring: Erbt von Rectangle (Prinzip: Ein Quadrat IST ein Rechteck).
 * Verhindert redundanten Code für Flächen- und Umfangsberechnung.
 */
class Square extends Rectangle {
    /**
     * Konstruktor nutzt 'side' für beide Dimensionen des Rectangle-Super-Konstruktors.
     */
    public Square(int id, double side, boolean filled, String color) throws IdException {
        super(id, side, side, filled, color);
    }
}