package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		Collection collections = new Collection();
		//collections.Collection();
		collections.arrayToArrayList();
	}


	public void Collection(){
		//Array
		String[] strArray = {"This is","an Array"};
		
		for (String string : strArray) {
			System.out.print(string+"\t\t");
		}
		System.out.println();
		
		//Array List
		List<String> strArrayList = new ArrayList<String>();
		strArrayList.add("This is an");
		strArrayList.add("Array List");
		
		System.out.println(strArrayList);
		
		List<String> strLinkedList = new LinkedList<String>();
		strLinkedList.add("This is a");
		strLinkedList.add("Linked List");
		
		System.out.println(strLinkedList);
		
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("This is a ");
		treeSet.add("set");
		treeSet.add("set");
		
		System.out.println(treeSet);
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1,"This");
		hashMap.put(2, "is hashMap");
		
		System.out.println(hashMap);
		
		Set<Map.Entry<Integer,String>> set = hashMap.entrySet();
		
		for (Map.Entry<Integer, String> entry : set) {
			System.out.print(entry.getKey()+" : ");
			System.out.println(entry.getValue());
		}
		
	}
	
	//Conversion from array to arrayList
	public void arrayToArrayList(){
		
		String[] strArray = {"dsd","sdfd"};
		for (String string : strArray) {
			System.out.print(string+" ");
		}
		
		//List<String> strArrayList1 = Arrays.asList(strArray);
		//strArrayList1.add("sdb");

		//System.out.println(strArrayList1);
		List<String> strArrayList1 = new ArrayList<String>();
		
		Collections.addAll(strArrayList1, strArray);
		System.out.println(strArrayList1);
		strArray[0] = "5";
		strArrayList1.add("45");
		System.out.println(strArrayList1);
	}
}
