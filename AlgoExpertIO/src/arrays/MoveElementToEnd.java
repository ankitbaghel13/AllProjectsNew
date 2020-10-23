package arrays;

import java.util.Arrays;

public class MoveElementToEnd {

	public static void main(String[] args) {

		int[] array = {2,1,2,2,2,3,4,2};
		moveElementToEnd(array,2);
		System.out.println(Arrays.toString(array));
	}

	private static void moveElementToEnd(int[] array, int number) {
		//{2,1,2,2,2,3,4,2}
		int length = array.length;
		int i=0;
		int j=0;
		while(i<length && j<length) {
			while(i<length) {
				if(array[i]==number)
					break;
				else
					i++;
			}while(j<length) {
				if(array[j]!=number)
					break;
				else
					j++;
			}
			if(i<length && j<length)
				swap(array,i,j);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
