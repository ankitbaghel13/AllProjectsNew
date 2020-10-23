package subarray;

public class MaxSumSubarray {

	public static void main(String[] args) {

		int[] arr = {1,-3,2,1,-1};
		int[] arr1 = {-2,3,2,-1};
		
		//naiveSol(arr);
		kadanesAlgo(arr1);
	}

	private static void kadanesAlgo(int[] arr) {
	
		int currMax=arr[0];
		int globalMax=arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			currMax = Math.max(arr[i], currMax+arr[i]);
			globalMax = Math.max(globalMax,currMax);
		}
		System.out.println(globalMax);
		
	}

	private static void naiveSol(int[] arr) {
		
		int start=0;int end=0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){
				sum += arr[j];
				if(sum>max){
					start=i;
					end=j;
					max=sum;
				}
			}
		}
		
		/*if(start==end)
			System.out.println();
		else
			System.out.println();*/
		
		System.out.println((start==end) ?"start and end="+start+" max="+max : "start="+start+" end="+end+" max="+max);
		//result = (start==end) ? System.out.println(start); : System.out.println(start+" "+end);
	}

}
