package genericMethods;

public class GreaterThan { // Aufgabe 3

	 public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
	        int temp = 0;
	        for (T item : array) {
	            if (item.compareTo(element) > 0) {
	                temp++;
	            }
	        }
	        return temp;
	 }
	 
	 public static void main(String[] args) {
		Integer[] numbers = {1,3,5,7,9};
		System.out.println(countGreaterThan(numbers,4)); // Ausgabe 3
	}
}
