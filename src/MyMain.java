import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

public class MyMain {
	public static void printPersons(List<Person> subList) {

		if (!subList.isEmpty()) {
			for (Person person : subList) {
				System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
						+ ", high : " + person.getHighCM() + ", weight : " + person.getWeightKG() + " ]");
			}
		} else {
			System.out.println("none");
		}
		System.out.println("");

	}

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		HashMap<String, Person> map = new HashMap<>();

		persons.add(new Person("Refi", 60, 170, "Male"));
		persons.add(new Person("Shreder", 70, 180, "Male"));
		persons.add(new Person("Lia", 50, 167, "Female"));
		persons.add(new Person("phibi", 51, 163, "Female"));
		persons.add(new Person("ross", 55, 160, "Male"));

		List<Person> sublist = new ArrayList<Person>();

		System.out.println("acorrding to gender:");
		sublist = persons.stream().filter(elem -> elem.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.toList());

		printPersons(sublist);

		System.out.println("acorrding to high:");

		sublist = persons.stream().filter(e -> (e.getGender().equalsIgnoreCase("male") && e.getHighCM() >= 170))
				.collect(Collectors.toList());
		printPersons(sublist);

	}
}
