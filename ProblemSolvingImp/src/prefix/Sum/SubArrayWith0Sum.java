package prefix.Sum;

import java.util.HashMap;
import java.util.Map;


/*
 * Value 4 in tmp at index 0 and 3 ==> sum tmp 1 to 3 = 0, length (3 - 1) + 1 = 3
Value 0 in tmp at index 5 ==> sum tmp 0 to 5 = 0, length (5 - 0) + 1 = 6
Value 3 in tmp at index 6 and 7 ==> sum tmp 7 to 7 = 0, length (7 - 7) + 1 = 1
 */
public class SubArrayWith0Sum {

	public static void main(String[] args) {

		int[] input = {4,  6,  3, -9, -5, 1, 3, 0, 2};
		//int[] tmp =   {4, 10, 13,  4, -1, 0, 3, 3, 5}
		int[] temp = new int[input.length];
		
		Map<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			if(i==0)
				temp[i] = input[i];
			else
				temp[i] = temp[i-1] + input[i];
			
			if(temp[i]==0){
				System.out.println("0 "+i);
			}else if(input[i]==0){
				System.out.println(i);
			}else if(hashMap.containsKey(temp[i])){
				System.out.println(hashMap.get(temp[i])+1+" "+i);
			}
			
			hashMap.put(temp[i],i);
		}
		
		System.out.println(hashMap);
	}

}
