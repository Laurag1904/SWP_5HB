package generics2;

public class Pair<T,U> {
	
	private final T first;
	private final U second;
	
	public Pair (final T first, final U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return this.first;
	}

	public U getSecond() {
		return this.second;
	}

	public Pair<T,U> swap(Pair <T,U> pair) {
		U second1; 
		T first1;
		second1 = pair.getSecond();
		first1 = pair.getFirst();
		Pair<T,U> pair2 = new Pair<T,U>(first1, second1);
		return pair2;
	}
}
