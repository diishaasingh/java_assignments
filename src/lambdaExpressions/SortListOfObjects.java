package lambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListOfObjects {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(2, "John", "2001-05-15", "john@gmail.com"));
		persons.add(new Person(4, "Alice", "2001-09-21", "alice@gmail.com"));
		persons.add(new Person(1, "Bob", "2003-12-02", "bob@gmail.com"));
		persons.add(new Person(3, "Emily", "2002-08-10", "emily@gmail.com"));

		persons.sort(Comparator.comparingInt(Person::getId));

		for (Person person : persons) {
			System.out.println(person);
		}
	}
}

class Person {
	private int id;
	private String name;
	private String dob;
	private String email;

	public Person(int id, String name, String dob, String email) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", name='" + name + '\'' + ", dob='" + dob + '\'' + ", email='" + email + '\''
				+ '}';
	}
}
