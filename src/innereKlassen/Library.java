package innereKlassen;

public class Library {
	
	// Statisches Feld
    public static String name = "Stadtbibliothek";

    // Statische geschachtelte Klasse
    public static class Book {
        public void showLibrary() {
            System.out.println("Bibliothek: " + Library.name);
        }
    }


}
