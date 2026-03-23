package generics;

public class PairTest {

	public static void main(String[] args) {
		
		Integer i1 = 1;
		Integer i2 = 2;
		Pair iPair = new Pair (i1, i2);

		Double d1 = 1.1;
		Double d2 = 2.2;
		Pair dPair = new Pair (d1, d2);
		
		Car c1 = new Car("audi",200);
		Car c2 = new Car("vw", 60);
		Pair cPair = new Pair (c1, c2);
		System.out.println(cPair.getFirst());
		
		Car c3 = (Car) cPair.getSecond(); // (car)... cast
		
		Pair icPair = new Pair (i1, c2);// ein Paar darf nicht zwei Datentype haben
	}

}
