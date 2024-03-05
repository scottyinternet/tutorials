package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("Scott");
		Person p2 = new Person("Kaela");

		List<Person> personList = new ArrayList<>();

		personList.add(p1);
		personList.add(p2);
		personList.add(new Person("Jamie"));

		personList.get(2).setName("Wells");
		System.out.println(personList.get(2).getName());

		Person newPerson = personList.get(1);
		String newPersonName = newPerson.getName();

		System.out.println(personList.get(0).makeMessage(newPersonName).toUpperCase());
	}


}
