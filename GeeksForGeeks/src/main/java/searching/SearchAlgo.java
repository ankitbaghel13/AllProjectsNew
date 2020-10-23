package searching;

/**
 * Hello world!
 *
 */
public class SearchAlgo 
{
    public static void main( String[] args )
    {
    	double start = System.currentTimeMillis();
    	
    	//int[] array = {4,2,3,6,7,9};
    	int[] array = {2,3,6,7,9,15};
    	int search = 7;
    	
    	//int index = linearSearch(search,array);
    	//int index = binarySearch(search,array);
    	int index = binarySearchRec(search,array);
    	
    	String result = (index != -1) ? "Element "+search+" is found at index "+index :
    		"Element "+search+" is not there in the array.";
    	
    	System.out.println(result);
    	double end = System.currentTimeMillis();
    	double time = (end - start)/1000;
    	
    	System.out.println("Time taken to execute program in ms : "+time);
    }


	private static int binarySearchRec(int search, int[] array) {
		
		int low = 0;
		int high = array.length-1;
		return bsrFunction(low,high,search,array);
	}


	private static int bsrFunction(int low, int high, int search, int[] array) {

		int mid = low + (high-low)/2;
		if(low<=high){
			if(search == array[mid])
				return mid;
			else if(search > array[mid])
				return bsrFunction(mid+1, high, search, array);
			else
				return bsrFunction(low, mid-1, search, array);
		}
		return -1;
	}


	@SuppressWarnings("unused")
	private static int linearSearch(Integer search,int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				return i;
			}
		}
		return -1;
	}
	
	@SuppressWarnings("unused")
	private static int binarySearch(int search, int[] array) {

		int low = 0;
		int high = array.length-1;
		int mid = 0;
		
		while(low<=high){
			mid = low + (high-low)/2;
			
			if(search == array[mid])
				return mid;
			else if (search > array[mid])
				low = mid+1;
			else 
				high = mid-1;
		}
		
		return -1;
	}
}
