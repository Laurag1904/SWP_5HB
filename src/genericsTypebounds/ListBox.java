package genericsTypebounds;

import java.util.ArrayList;

public class ListBox<T extends Number> {
	
	private ArrayList<Integer> sum = new ArrayList<Integer>();
	
	public ListBox(ArrayList<Integer> sum) {
		this.sum = sum;
	}

	public ArrayList<Integer> getSum() {
		return sum;
	}

	public void sumElements() {
		int sum;
		sum = 0;	
		for(int i = 0; i < this.sum.size(); i++) {
			sum += this.sum.get(i);
		}
		System.out.println("Summe:" + sum);
	}

}
