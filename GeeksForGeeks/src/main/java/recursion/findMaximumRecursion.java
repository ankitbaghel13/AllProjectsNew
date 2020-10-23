package recursion;

import java.util.Scanner;

public class findMaximumRecursion {

	public static void maxMin(int[] arr) {

		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			else
				min = arr[i];
		}
		System.out.println("Max : "+max+" Min : "+min);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		

		int num = scanner.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}

		//maxMin(arr);
		
		System.out.println(findMaxRecursion(arr,num-1));
	}

	private static int findMaxRecursion(int[] arr, int index) {

		if(index>0)
			return Math.max(arr[index], findMaxRecursion(arr, index-1));
		else
			return arr[0];
	}
}
