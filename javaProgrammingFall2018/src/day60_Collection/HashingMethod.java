package day60_Collection;

import java.util.*;

public class HashingMethod {
public static void main(String[] args) {
	Set<Person> set= new HashSet<>();
	
	Person p1=new Person(12,"Joh");
	Person p2=new Person(12,"Joh");
	System.out.println(p1);
	
	set.add(p1);
	set.add(p2);
	System.out.println(set);
	
	
}
}
class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}





