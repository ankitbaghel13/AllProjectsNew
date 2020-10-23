package collections;

import java.util.TreeMap;

public class TreeMapConcepts {
	
	public static void main(String[] args) {
		
		TreeMap<Employee1,String> map = new TreeMap<>();
		map.put(new Employee1(1), "Ankit");
		map.put(new Employee1(2), "Mohit");
		
		System.out.println(map.size());
	}

}

class Employee1 implements Comparable<Employee1>{
	
	public int id;
	
	public Employee1(int id){
		this.id = id;
	}
	
	@Override
	public int compareTo(Employee1 o) {
		
		return this.id - o.id;
	}
}
