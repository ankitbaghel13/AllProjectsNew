package classLevelConcepts;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {

	private final int id;
	private final String name;
	private final HashMap<Integer,String> map;
	
	public ImmutableClass(int id,String name,HashMap<Integer,String> map) {

		this.id = id;
		this.name = name;
		this.map = new HashMap<Integer,String>(map);
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@SuppressWarnings("unchecked")
	public HashMap<Integer,String> getMap(){
		return (HashMap<Integer,String>)map.clone();
	}
	
	
	/*public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}*/
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Ankit");
		map.put(2, "Rohit");
		
		ImmutableClass immutableClass = new ImmutableClass(1, "Ankit",map);
		
		System.out.println(immutableClass.getMap().size());
		
		map.put(3, "Mohit");
		System.out.println(immutableClass.getMap().size());
		
		immutableClass.getMap().put(4,"Rahul");
		System.out.println(immutableClass.getMap().size());
	}
	
}
