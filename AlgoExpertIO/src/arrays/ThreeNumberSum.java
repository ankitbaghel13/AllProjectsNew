package arrays;

import java.util.Arrays;

//O(n2) time | O(1) space
public class ThreeNumberSum {

	public static void main(String[] args) {

		int[] array = {12,3,1,2,-6,5,-8,6};
		//sorted array = {-8,-6,1,2,3,5,6,12}
		int targetSum = 0;
		
		Arrays.sort(array);
		findTripletsWithSum(array, targetSum);
	}

	private static void findTripletsWithSum(int[] array, int targetSum) {
	
		int left;
		int right;
		int currentSum;
		
		for(int i=0;i<array.length-2;i++){
			left = i+1;
			right = array.length-1;
			while(left<right){
				currentSum = array[i] + array[left] + array[right];
				if(currentSum == targetSum){
					System.out.println(array[i]+" : "+array[left]+" : "+array[right]);
					left++;
					right--;
				}
				else if(currentSum < targetSum)
					left++;
				else
					right--;
			}
		}
	}

}
