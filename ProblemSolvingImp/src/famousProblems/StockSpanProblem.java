package famousProblems;

import java.util.Arrays;

public class StockSpanProblem {

	public static void main(String[] args) {
		int arr[] = {100,80,60,70,60,75,85};
		
		findSpanForStocks(arr);
	}

	private static void findSpanForStocks(int[] arr) {
	
		int j;
		int span;
		int spanArr[] = new int[arr.length];
		spanArr[0] = 1;
		for(int i=1;i<arr.length;i++){
			
			j=i-1;
			span=1;
			while(j>=0){
				if(arr[i]>arr[j]){
					span++; j--;
				}
				else
					break;
			}
			spanArr[i] = span;
		}
		
		for(int a : spanArr)
			System.out.print(a+" ");
		//Arrays.toString(spanArr);
	}

}
