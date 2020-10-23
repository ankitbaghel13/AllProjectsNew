package sorting;


public class AllSortingAlgos {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*System.out.println("Please enter the word : ");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str = scanner.nextLine();

		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str));*/
		//System.out.println(isPalindrome(35335));
		//bubbleSort();
		//selectionSort();
		//insertionSort();
		mrgeSrt();
	}

	private static String isPalindrome(int i) {

		int temp = i;
		int sum = 0;
		while(i>0){
			sum = sum*10 + i%10;
			i = i/10;
		}

		if(temp == sum ){
			return temp+" is palindrome";
		}
		else{
			return temp+" is not palindrome";
		}


	}

	private static String isPalindrome(String str1) {



		if(str1.length() == 0){
			return "Please enter proper input";
		}
		String str = str1.toLowerCase();
		int length = str.length();
		int count = 0;
		for(int i=0,j=length-1;i<length/2 && j>(length/2)-1;i++,j--){
			if(str.charAt(i) == str.charAt(j)){
				count++;
			}
			else{
				break;
			}
		}

		if(count == length/2){
			return str1+" is palindrome";
		}
		else{
			return str1+" is not palindrome";
		}
	}

	//Bubble sort
	public static void bubbleSort() {
		int n, i, j, swap;

		int[] array = {3,3,4,2,1};
		n = array.length;

		for (i = 0; i <  n - 1 ; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j+1]) /* For descending order use < */
				{
					swap       = array[j];
					array[j]   = array[j+1];
					array[j+1] = swap;
				}
			}
		}

		System.out.println("Sorted list of numbers");

		for (i = 0; i < n; i++) 
			System.out.print(array[i]+" ");
	}

	//InsertionSort
	public static void insertionSort(){

		int n, i, value, tmpI;

		int[] arr = {3,5,4,8,1};
		n = arr.length;

		for(i = 1;i<n;i++){
			value = arr[i];
			tmpI = i;

			while(tmpI>0 && arr[tmpI-1]>value){
				arr[tmpI] = arr[tmpI-1];
				tmpI = tmpI-1;
			}
			arr[tmpI]= value;
		}

		System.out.println("Sorted list of numbers");

		for (i = 0; i < n; i++) 
			System.out.print(arr[i]+" ");

	}

	//SelectionSort
	public static void selectionSort(){

		int n, i, temp,j,iMin;

		int[] arr = {3,5,4,8,1};
		n = arr.length;

		for (i = 0; i < n; i++) {
			iMin = i;
			for(j = i+1;j<n;j++){
				if(arr[j]<arr[iMin]){
					iMin = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = temp;
		}

		System.out.println("Sorted list of numbers");

		for (i = 0; i < n; i++) 
			System.out.print(arr[i]+" ");
	}


	public static void mrgeSrt(){

		int[] numbers = {2,1,7,5,6,3,8,4};
	    int number = numbers.length;
	    //int[] helper = new int[number];
	    mergesort(0, number - 1);
	    for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	    
	}

	public static void mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	public static void merge(int low, int middle, int high) {
		
		int[] numbers = {2,1,7,5,6,3,8,4};
	    int number = numbers.length;
	    int[] helper = new int[number];

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}

	}


}