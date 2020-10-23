import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LRUCache {
	
	static Set<Integer> lruSet = new LinkedHashSet<>(5);

	public static void main(String[] args) {

//insert
//1
//2
//3
//4
//5
//retrieve
//1
//insert
//6
//		i1 -> 1,2,3,4,5
//		r1 -> 2,3,4,5,1
//		i2 -> 3,4,5,1,6
		
		//lru();
		String current;
		String prev="";
		int i;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()) {
			current = scanner.nextLine();
			
			if(current.equals(""))
				break;
			if(current.equals("insert")) 
				prev = "insert";
			else if(current.equals("retrieve"))
				prev = "retrieve";
			else {
				i = Integer.parseInt(current);
				if(prev.equals("insert")) {
					insert(i);
				}
				else {
					retrieve(i);
				}
			}
		}
		scanner.close();
		System.out.println(lruSet);
//		LRUCache lru = new LRUCache();
//		lru.insert(1);
//		lru.insert(2);
//		lru.insert(3);
//		lru.insert(4);
//		lru.insert(5);
//		lru.retrieve(1);
//		lru.insert(6);
//		
//		System.out.println(lruSet);
	}
	
	public static void insert(int i) {
		if(lruSet.contains(i))
			lruSet.remove(i);
		else if(lruSet.size()==5) 
			lruSet.remove(lruSet.iterator().next());
	
		lruSet.add(i);
	}
	
	public static void retrieve(int i) {
		if(lruSet.contains(i)) {
			lruSet.remove(i);
			lruSet.add(i);
		}
	}
	
}
