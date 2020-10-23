package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {

	//T.C. O(n)
	//S.C. O(n)
	public static void main(String[] args) {
		int[] array = {3,5,-4,8,11,1,-1,6};
		//sorted array = {-4,-1,1,3,5,6,8,11}
		int targetSum = 13;
		
		//O(n) time | O(n) space
		//findTwoNumberSumUsingHashSet(arr, sum);
		
		//O(nlogn) time | O(1) space
		findTwoNumberSumUsingSorting(array, targetSum);
	}

	private static void findTwoNumberSumUsingSorting(int[] array, int targetSum) {
		
		Arrays.sort(array);
		int left=0;
		int right=array.length-1;
		int currentSum;
		while(left<right){
			currentSum = array[left]+array[right];
			if(currentSum == targetSum){
				System.out.println(array[left]+" : "+array[right]);
				return;
			}else if(currentSum<targetSum)
				left++;
			else
				right--;
		}
	}

	@SuppressWarnings("unused")
	private static void findTwoNumberSumUsingHashSet(int[] arr, int target) {
	
		Set<Integer> numberSet = new HashSet<>();
		
		//Normal
		/*for(int i=0;i<arr.length;i++){
			if(numberSet.contains(sum-arr[i]))
				System.out.println((sum-arr[i])+" : "+arr[i]);
			numberSet.add(arr[i]);
		}*/
		
		//Java 8 streams
		Arrays.stream(arr).forEach(i -> {
			if(numberSet.contains(target-i))
				System.out.println((target-i)+" : "+i);
			numberSet.add(i);
		});
		
		/*Arrays.stream(arr).forEach(i->numberSet.add(i));
		numberSet.remove(sum/2);
		System.out.println(numberSet.stream().
				filter(i->numberSet.contains(sum-i)).
				collect(Collectors.toSet())
				);*/
		
	}

}
