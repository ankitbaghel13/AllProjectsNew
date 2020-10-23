package InterviewSpectraMedix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListMethods {

	public static void main(String[] args) {
		
		//Find Union and intersection 4 lists
		List<Integer> list1 = new ArrayList<Integer>((Arrays.asList(2, 3, 4, 7, 1)));
		List<Integer> list2 = new ArrayList<Integer>((Arrays.asList(4, 1, 3, 5)));
		List<Integer> list3 = new ArrayList<Integer>((Arrays.asList(8, 4, 6, 2, 1)));
		List<Integer> list4 = new ArrayList<Integer>((Arrays.asList(7, 9, 4, 1)));
		
		Set<Integer> set = new HashSet<>(list1);
		set.addAll(list2);
		set.addAll(list3);
		set.addAll(list4);
		
		System.out.println(set);
		
		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		
		System.out.println(list1);
	}

}
