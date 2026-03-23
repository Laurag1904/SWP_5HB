package genericMethods;

public class FindMin { //Aufgabe 2
		
	public static <T extends Comparable <T>> Object findMin(T a, T b) {
	     return a.compareTo(b) < 0 ? a : b;
	}

	public static void main(String[] args) {
	      System.out.println(findMin (15, 1)); //Ausgabe 1 
	      System.out.println(findMin ("Dog", "Cat")); //Ausgabe Cat
	}
}

//Funktioniert alphabetisch C kommt vor D deswegen C
