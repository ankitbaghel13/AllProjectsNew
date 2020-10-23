package searching;

public class BinSearchRecursion {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9, 13, 15, 78, 80 };
		int element = 9;

		int index = binarySearch(arr, 0, arr.length - 1, element);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int low, int high, int element) {

		int mid = low + (high - low) / 2;

		if (low <= high) {
			if (arr[mid] == element)
				return mid;
			else if (arr[mid] > element)
				return binarySearch(arr, low, mid - 1, element);
			else
				return binarySearch(arr, mid + 1, high, element);
		}
		return -1;
	}
}
