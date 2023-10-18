package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	
	public static void main(String[] args) {
		ArrayList<Person> people=new ArrayList<>();
		people.add(new Person("sachin",25));
		people.add(new Person("kamal",24));
		people.add(new Person("amar",29));
		
		Collections.sort(people);
		
		for(Person person:people) {
			System.out.println(person);
		}
	}

}

class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person otherPerson) {
		//return this.name.compareTo(otherPerson.name);
	      return this.age-otherPerson.age;
	}
	
}
