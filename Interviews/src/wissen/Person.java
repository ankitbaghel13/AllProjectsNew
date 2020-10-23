package wissen;

import java.util.HashMap;
import java.util.Map;

public class Person {
	
	private String name;
	
	public Person() {

	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		/*passByRefOrPBV();
		stringImmutability();
		print(0);*/
		equalsHashCodeContract();
	}


	private static void equalsHashCodeContract() {
		
		Map<Person,String> hashMap = new HashMap<>();
		hashMap.put(new Person("Ankit"),"Ankit");
		hashMap.put(new Person("Baghel"), "Baghel");
		hashMap.put(new Person("Ankit"),"Ankit");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(new Person("Ankit")));
		System.out.println(hashMap.size());
		
		Map<Person,String> treeMap = new HashMap<>();
		treeMap.put(new Person("Ankit"),"Ankit");
		treeMap.put(new Person("Baghel"), "Baghel");
		treeMap.put(new Person("Ankit"),"Ankit");
		
		System.out.println(treeMap);
		System.out.println(treeMap.get(new Person("Ankit")));
		System.out.println(treeMap.size());
		
	}
	
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		
		Person other = (Person) obj;
		return name.equals(other.name);
	}

	public static void stringImmutability() {
		String str = "Ankit";
		System.out.println(str.hashCode());
		
		str = "A";
		System.out.println(str.hashCode());
	}


	public static void passByRefOrPBV() {
		Person person = new Person();
		
		String name = "Abc";
		person.setName(name);
		
		System.out.println(person.getName()+" "+name);
		
		m1(person,name);
		
		System.out.println(person.getName()+" "+name);
	}


	private static void print(int i) {
		
		System.out.println(i);
		print(i-1);
	}


	private static void m1(Person person, String name2) {
		
		person.setName("Xyz");
		name2 = "Pqr";
	}

}
