package reference;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String makeMessage(String otherName) {
		return "Hello "+ otherName + ", my name is " + this.name;
	}
}
