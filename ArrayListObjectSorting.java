package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Person{
	int age;
	String name;
	
	
	
	Person(int a, String s){
		
		this.age = a;
		this.name = s;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		
		return "{"+ "name = '"+ name +'\'' + " age = "+ age+'}';
		
	}
	
		
	
}

public class ArrayListObjectSorting {
	public static void main(String args []) {
		
		
		List<Person> ar = new ArrayList<Person>();
		ar.add(new Person(5,"Rashid"));
		ar.add(new Person(34,"meera"));
		ar.add(new Person(50,"Nahid"));
		ar.add(new Person(31,"Ram"));
		ar.add(new Person(44,"dheeraj"));
		ar.add(new Person(67,"hariram"));
		
		System.out.println(ar);
		Collections.sort(ar,Comparator.comparing(Person::getAge));
		System.out.print(ar);
		
	}

}
