package sorting;

import java.util.Arrays;

public class QuickSort {

	static int a[] = new int[10];
	
	public static void main(String[] args) {

		int[] arr = {2,34,3,53,34,253,5,35,3,53};
		
		char c = 'a';
		
		//int a1 = c;
		System.out.println((int)c);
		
		a = arr;
		System.out.println("Array unsorted : "+Arrays.toString(a));
		sort(0,a.length-1);
		System.out.println("Array sorted : "+Arrays.toString(a));
	}

	private static void sort(int low, int high) {

		int i = low;
		int j = high;
		int pivot = a[low+(high-low)/2];	
		
		while(i<=j){
			while(pivot>a[i])
				i++;
			while(pivot<a[j])
				j--;
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}
		
		if(low<j)
			sort(low, j);
		if(i<high)
			sort(i, high);
	}

	private static void swap(int i, int j) {

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
