package arrays;

public class Merge2SortedArraysDesc {

	public static void main(String[] args) {

		int[] arr1 = {7,5,3,1};
		int[] arr2 = {9,8,6,2,0};
		
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length){
			
			if(arr1[i]>arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
			}
			else{
				System.out.print(arr2[j]+" ");
				j++;
			}
		}
	}

}
