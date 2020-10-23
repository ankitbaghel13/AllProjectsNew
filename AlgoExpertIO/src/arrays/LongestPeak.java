package arrays;

public class LongestPeak {

	public static void main(String[] args) {

		int[] array = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
		System.out.println(longestPeak(array));
	}

	private static int longestPeak(int[] array) {
		
		int currentPeak=0;
		int longestPeak=0;
		for(int i=1;i<array.length-1;i++) {
			
			if((array[i-1]<array[i]) && (array[i]>array[i+1])) {
				int left=i-1;
				int right=i+1;
				while(left>0 && (array[left-1]<array[left])) 
					left--;
				
				while(right<array.length-1 && (array[right]>array[right+1])) 
					right++;
				
				currentPeak = right-left+1;
				longestPeak = currentPeak>longestPeak ? currentPeak : longestPeak;
				i=right;
			}
		}
		
		return longestPeak;
	}

}
