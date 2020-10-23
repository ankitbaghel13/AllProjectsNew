package searching;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(1);
		list.add(3);
		list.add(7);
		
		Collections.sort(list);
		
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer+" ");
		}
		
		int result = binarysrch(list, 9);
		
		if(result == -1) {
			System.out.println("Element not present");
		}else{
			System.out.println("Element found at "+result+" index");
		}
	}

	public static int binarysrch(List<Integer> list,Integer x) {
		
		int count = 0;
		int l=0,r=list.size()-1;
		
		
		while (l <= r) {
			Integer m = l + (r - l) / 2;
			count++;
			System.out.println("Count : "+count);
			if (list.get(m) == x)
				return m;

			if (list.get(m) > x)
				r = m - 1;
			else
				l = m + 1;

		}
		return -1;
	}
}
