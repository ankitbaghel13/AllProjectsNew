package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperations {

	public static void main(String[] args) {

		listOperations();
	}

	private static void listOperations() {

		List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
		List<Integer> secondList = new ArrayList<>(Arrays.asList(1, 2));

		//containsAll
		System.out.println(firstList.containsAll(secondList));
		
		//addAll
		//secondList.addAll(firstList);
		
		//removeAll
		//secondList.removeAll(firstList);
		
		//retainAll
		firstList.retainAll(secondList);
		
		//clear
		secondList.clear();
		
		System.out.println(secondList);
		
		
	}

}
