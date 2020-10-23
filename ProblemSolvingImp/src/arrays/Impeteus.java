package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Impeteus {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,11,9,8,10};
		
		int arr1[] = {0,1,1,0,0,1,0,1,0};
		int arr2[] = {1,2,3,4,5,3,4,5,6,7,9,10,11,12,8,9,10,21,35,36,37,22};
		int arr3[][] = {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
		//getIncreasingSequence(arr2);
		//segregate0s1s(arr1);
		//getFourthHighest(arr);
		//printOrder(arr3);
		
		longestSubstring("helloworld");
		
	}

	private static void longestSubstring(String string) {
	
		 char[] chArray = string.toCharArray();
		 Set<Character> set = new LinkedHashSet<>();
		 List<String> list = new ArrayList<>();
		 int maxLength=0;
		 int currLength=0;
		 int j=0;
		 String str="";
		 
		 for(int i=0;i<chArray.length;i++){
			 
			 j = i+1;
			 set.clear();
			 set.add(chArray[i]);
			 currLength = 1;
			 str = "";
			 str += chArray[i];
			 while(j<chArray.length-1){
				 
				 set.add(chArray[j]);
				 if(set.size()>2)
					 break;
				 str += chArray[j];
				 j++;
				 currLength++;
			 }
			 if(currLength>1 && currLength>maxLength){
				 list.clear();
				 list.add(str);
				 maxLength = currLength;
			 }else if(currLength==maxLength){
				 list.add(str);
			 }
		 }
		 System.out.println(list);
	}

	private static void printOrder(int[][] arr) {
		
		int row = arr.length;
		int col = arr[0].length;
		int k=0;
		boolean flag = false;
		
		for(int i=0;i<col;i++){
			
			flag = !flag;
			if(flag){
				k=0;
				while(k<row){
					System.out.print(arr[k][i]+" ");
					k++;
				}
			}
			
			if(!flag){
				k=row-1;
				while(k>=0){
					System.out.print(arr[k][i]+" ");
					k--;
				}
			}
		}
		
	}

	private static void getIncreasingSequence(int[] arr) {
		
		int sum=0;
		int temp;
		int low=0;
		int high=0;
		int currentSum;
		int i=0;
		
		while(i<arr.length-1){
			
			temp = i;
			currentSum=arr[i];
			while((arr[i]==arr[i+1]-1)&&i<arr.length-1){
				currentSum += arr[i+1];
				i++;
			}
			if(currentSum>sum){
				sum = currentSum;
				low = temp;
				high = i;
			}
			i++;
		}
		
		System.out.println(sum);
		for(int k=low;k<=high;k++)
			System.out.print(arr[k]+" ");
	}

	private static void segregate0s1s(int[] arr) {
		
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j){
			
			while(arr[i]==0 && i<j)
				i++;
			while(arr[j]==1 && i<j)
				j--;
			
			if(i<j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	private static void getFourthHighest(int[] arr) {
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		int fourthMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>firstMax){
				fourthMax = thirdMax;
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];
			}else if(arr[i]>secondMax){
				fourthMax = thirdMax;
				thirdMax = secondMax;
				secondMax = arr[i];
			}else if(arr[i]>thirdMax){
				fourthMax = thirdMax;
				thirdMax = arr[i];
			}else if(arr[i]>secondMax){
				fourthMax = arr[i];
			}
		}
		
		System.out.println(fourthMax);
	}

}
