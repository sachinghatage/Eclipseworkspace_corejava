package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<PersonA> people=new ArrayList<>();
		people.add(new PersonA("sachin",25));
		people.add(new PersonA("kamal",24));
		people.add(new PersonA("amar",29));
		
		//Collections.sort(people,new NameComparator());
		Collections.sort(people,new NameComparator());
		for(PersonA person:people) {
			System.out.println(person);
		}
	}

}

class PersonA{
	private String name;
	private int age;
	public PersonA(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonA [name=" + name + ", age=" + age + "]";
	}

	
		
}

class NameComparator implements Comparator<PersonA>{

	@Override
	public int compare(PersonA person1, PersonA person2) {
		return person1.getName().compareTo(person2.getName());
	}
	
}
