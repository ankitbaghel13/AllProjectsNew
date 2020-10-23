package wissen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ListManipulationWithIterator {

	public static void main(String[] args) {

		listManipulation();
		
	}

	private static void listManipulation() {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(-1);
		list.add(-2);
		list.add(0);
		
		System.out.println(list);
		
		// Normal for loop
		/*for(int i=0;i<list.size();i++){
			if(list.get(i)<0)
				list.remove(i);
		}*/
		
		
		//For each loop
		/*for(int i : list){
			if(i<0)
				list.remove(i);
		}*/
		
		
		//Using Iterator
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()){
			if(it.next()<0) 
				it.remove();
		}
		
		
		System.out.println(list);
		
		
	}

}
