package innereKlassen;

import innereKlassen.Bank.Account;

public class Test {

	public static void main(String[] args) {
		
		//Aufgabe 1 
		System.out.println(Calculator.Addition.add(1,2));

		//Aufgabe 2 
		// Objekt der geschachtelten Klasse erstellen
        Library.Book book = new Library.Book();

        // Methode aufrufen
        book.showLibrary();
        
        //Aufgabe 3
        Mathematics.Factorial f = new Mathematics.Factorial();
        
        System.out.println("Fakultät von 5: " + f.berechne(5));
        System.out.println("Fakultät von 7: " + f.berechne(7));
        System.out.println("Fakultät von 10: " + f.berechne(10));
        
        //Aufgabe 4 
        Person person = new Person ("Laura");
        Person.Details details = person.new Details ();
        details.showName();
        
        // Aufgabe 5
        new University().new Student().showData("Laura", 1);
        
        //Aufgabe 6
        Bank b = new Bank();
        Account a = b.new Account();
        a.deposit(1000);
        b.showBalance();
        a.deposit(500);
        b.showBalance();
	}

}
