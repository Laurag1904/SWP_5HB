package genericMethods;

import java.util.Arrays;
import java.util.List;

public class PrintList { //Aufgabe 4 
	
	public static void printList(List<?> list) {
        System.out.println(list);
    }
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("One", "Two", "Three");
		List<Integer> intList = Arrays.asList(1,2,3);
		
		printList(stringList); // Ausgabe; One, Two, Three
		printList(intList); // Ausgabe: 1,2,3
	}

}
