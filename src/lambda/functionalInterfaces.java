package lambda;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functionalInterfaces {
	
	public static void main(String[] args) {

		//Aufgabe 1 
		Runnable runnable = () -> {System.out.println("1 2 3 4 5 6 7 8 9 10");};
		new Thread(runnable).start();
		
	
		//Aufgabe 2 
		Supplier<Integer> randomSupplier = () -> new Random().nextInt(100) + 1;
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());
        
        //Aufgabe 3 
        Consumer<String> toUpperCaseConsumer =
        		s -> System.out.println(s.toUpperCase());

        toUpperCaseConsumer.accept("Hallo Welt");
        toUpperCaseConsumer.accept("HI");
    
        
        //Aufgabe 4 
        List<String> strings = Arrays.asList(
                "Banane", "Apfel", "Kirsche", "Erdbeere", "Kiwi");

        Comparator<String> lengthComparator =
                (s1, s2) -> Integer.compare(s1.length(), s2.length());

        strings.sort(lengthComparator);

        System.out.println(strings);
        
        //Aufgabe 5 
        ActionListener listener = e -> System.out.println("Button clicked!");
        listener.actionPerformed(null);
        
        //Aufgabe 6 
        List<String> names = Arrays.asList("Max", "Anna", "Clara", "Bernds");
        // Alphabetisch sortieren
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Alphabetisch: " + names);
        //Liste absteigend nach Länge der Namen
        names.sort((a, b) -> Integer.compare(b.length(), a.length()));
        System.out.println("Länge absteigend:" + names);
        //Alphabetisch Namen mit einer Länge von 3 Zeichen sollen zuerst erscheinen
        names.sort((a, b) -> {
            if (a.length() == 3 && b.length() != 3) return -1;
            if (a.length() != 3 && b.length() == 3) return 1;
            return a.compareTo(b);
        });

        System.out.println("Länge 3 zuerst: " + names);
        
        //Aufgabe 7 
        Predicate<String>longerThanFive =
                s -> s.length() > 5;
        Consumer<Integer> multiply = 
        		n -> System.out.println(n*10);
        Supplier<String> ausgabe = 
        		() -> "Lambda ist cool!";
       
        System.out.println(longerThanFive.test("Hallo"));
        multiply.accept(7);
        System.out.println(ausgabe.get());
	}
}
