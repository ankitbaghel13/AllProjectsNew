package sorting;

import java.util.Arrays;

public class QuickSort1 {

	public static void main(String[] args) {
		//int[] arr = {9,11,1,5,6,8,7}; 
		int[] arr = {8,7,1,2,3,9,6};
		
		//quickSortPivotM(0,arr.length-1,arr);
		quickSortPivotL(0,arr.length-1,arr);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSortPivotL(int low, int high, int[] arr) {

		if(low<high){
			int pi = partition(low,high,arr);
			
			quickSortPivotL(low, pi-1, arr);
			quickSortPivotL(pi+1, high, arr);
		}
	}

	private static int partition(int low, int high, int[] arr) {

		int i=low-1;
		int pivot = arr[high];
		int temp;
		
		for (int j = low; j < high; j++) {
			if(arr[j]<pivot){
				i++;
		
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		temp = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = temp;
		
		return i+1;
	}

	private static void quickSortPivotM(int low, int high, int[] arr) {

		int i=low;
		int j=high;
		//int pivot = arr[low+(high-low)/2];
		int pivot = arr[high];
		int temp;
		
		while(i<=j){
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			
			if(i<=j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			
		}
		if(low<j)
			quickSortPivotM(low, j, arr);
		if(i<high)
			quickSortPivotM(i, high, arr);
	}
	
	
	
	
}
