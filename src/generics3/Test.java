package generics3;

public class Test {
	
	public static void main(String[] args) {

		//Aufgabe 1
        String Box1 = "Box";
        Box<String> b = new Box(Box1);
        System.out.println(b);

        int Box2 = 2;
        Box<Integer> b2 = new Box(Box2);
        System.out.println(b2);

        double Box3 = 1.1;
        Box<Double> b3 = new Box(Box3);
        System.out.println(b3);
        
        // Aufgabe 2
        
        String T ="t";
        Integer U = 1;
        Double V = 1.1;
        Triple<String, Integer, Double> t = new Triple(T,U,V);
        System.out.println(t);
    }

	

}
