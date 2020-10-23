package listManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversingListWithoutAT {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		int size = list.size();
		
		printList(list);
		
		for(int i=0;i<size/2;i++){
			int temp = list.get(i);
			list.set(i, list.get(size-1-i));
			list.set((size-1-i),temp);
		}
		
		printList(list);
		
	}

	private static void printList(List<Integer> list) {

		for(int i : list)
			System.out.print(i+" ");
		
		System.out.println();
	}
}
