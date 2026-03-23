package genericsTypebounds;

import java.util.ArrayList;

public class Test <T>{

	public static void main(String[] args) {
		//Aufgabe 1
		SortableBox<Integer> B = new SortableBox(1, 2);
		SortableBox<Integer> B1 = new SortableBox(5, 2);
		System.out.println(B.compareToOtherBox(B1));
		 
		SortableBox<Double> B2 = new SortableBox(1.1, 2.2);
		System.out.println(B2.compareToOtherBox(B2));
		 
		 
		//Aufgabe 2 
		Circle c1 = new Circle("Circle");
		ShapeBox s1 = new ShapeBox(c1);
		s1.drawShape(c1);
			
		//Aufgabe 3
		Cat cat1 = new Cat();
		AnimalCage <Cat> c = new AnimalCage<Cat>(cat1);
		c.makeSound(cat1);
			
		Dog dog2 = new Dog();
		AnimalCage <Dog> d = new AnimalCage<Dog> (dog2);
		d.makeSound(dog2);
			
		//Aufgabe 4
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(4);

        ListBox<Integer> L1 = new ListBox<Integer>(list);
        L1.sumElements();
        
        
        //Aufgabe 5
        Transformer<Integer,String> intToString = new Transformer<>();
        String result = intToString.transform(42, Object::toString);
        Transformer<Double,Integer> dti = new Transformer();
        Integer iResult = dti.transform(3.14, Double:: intValue);
		 
	}
}
