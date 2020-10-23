import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Paytm {

	public static void main(String[] args) {

		 int[] arr = {25,15,20,5,10};
		
		//secondMax(arr);
		commonPoints();
	}

	private static void commonPoints() {
	
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		/*ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(4,5,6));*/
		
		int n = 3;
		int input[][] ={{2,5},{3,6},{4,6}}; 
		int start;
		int end;
		Map<Integer,List<Integer>> map = new HashMap<>();
		
		for(int i=0;i<n;i++){
		
			list1 = new ArrayList<>();
			start = input[i][0];
			end = input[i][1];
			//System.out.println(start+"-"+end);
			//System.out.println();
			for(int j=start;j<=end;j++)
				list1.add(j);
			
			map.put(i,list1);
			
		}
		list2 = map.get(0);
		for(Entry<Integer,List<Integer>> entry : map.entrySet()){
			list2.retainAll(entry.getValue());
		}
		/*list1.retainAll(list2);
		list1.retainAll(list3);
		*/
		System.out.println(list2);
	}

	private static void secondMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>max){
				secMax = max;
				max = arr[i];
			}else if(arr[i]>secMax)
				secMax = arr[i];
		}
		
		System.out.println(secMax);
	}

}
