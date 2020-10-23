package arrays;
//Largest sum subarray
//kadane's algorithm
public class LargestSumContiguousSubarray {

	public static void main(String[] args) {

		int[] array = {1,-3,4,-1,-2,1,5,-3};
		
		int currMax=array[0];
		int globalMax=array[0];
		
		for(int i=1;i<array.length;i++) {
			currMax = Math.max(array[i], array[i]+currMax);
			
			if(currMax>globalMax)
				globalMax = currMax;
		}
		System.out.println(globalMax);
	}

}
