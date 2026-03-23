package generics2;

public class PairTest {
	
		int c =1;
		int i=2;
		Pair<Integer, Character> pair = new Pair(c, i);
	
	    private static void printPair (final Pair<Integer, String> i) {
	        System.out.println(i.getFirst() + " " + i.getSecond());
	    }
	    public static void main (final String[] args) {
	        final Pair<Integer, String> p = new Pair<Integer, String>(1, "Hallo");
	        PairTest.printPair (p);

	    }
	    
	
	}
