package arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {

		//kadane's algorithm
		int[] array = {6,-3,-10,0,2};
		int maxCurrProd = array[0];
		int minCurrProd = array[0];
		int globalMaxProd = array[0];
		int choice1,choice2;
		for(int i=1;i<array.length;i++) {
			
			//approach1
			choice1 = maxCurrProd*array[i];
			choice2 = minCurrProd*array[i];
			if(array[i]>0) {
				maxCurrProd = Math.max(choice1, array[i]);
				minCurrProd = Math.min(choice2, array[i]);
			}else if(array[i]<0) {
				maxCurrProd = Math.max(choice2, array[i]);
				minCurrProd = Math.min(choice1, array[i]);
			}else {
				maxCurrProd=0;
				minCurrProd=0;
			}
			//approach2
//			maxCurrProd = Math.max(choice2, Math.max(choice1, array[i]));
//			minCurrProd = Math.min(choice1, Math.min(choice2, array[i]));
			
			globalMaxProd = Math.max(globalMaxProd, maxCurrProd);
		}
		
		System.out.println(globalMaxProd);
	}

}
