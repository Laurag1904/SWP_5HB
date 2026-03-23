package innereKlassen;

public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public class Details{
		public void showName() {
			System.out.println(name);
		}	
	}
}
