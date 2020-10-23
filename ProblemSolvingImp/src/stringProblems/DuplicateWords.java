package stringProblems;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;


public class DuplicateWords {

	public static void main(String[] args) {
		
		//removeDuplicate(); 
		findDuplicate();
	}

	public static void removeDuplicate() {
		String str = "I have a pen.I have an apple.";
		
		str = str.replace(".", " ");
		System.out.println(str);
		String[] strArray = str.split(" ");
		
		/*for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]+" ");
		}*/
		
		LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(strArray));
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}
	
	public static void findDuplicate() {
		String str = "I have a pen.I have an apple.";
		
		str = str.replace(".", " ");
		System.out.println(str);
		String[] strArray = str.split(" ");
		
		/*for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]+" ");
		}*/
		
		/*LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(strArray));
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}*/
		
		HashMap<String, Integer> map = new HashMap<>();

		for (String string : strArray) {
			if(map.containsKey(string))
				map.put(string, map.get(string)+1);
			else
				map.put(string, 1);
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}
	}
}
