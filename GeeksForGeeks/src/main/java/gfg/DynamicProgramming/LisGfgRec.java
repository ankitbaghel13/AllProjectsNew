package gfg.DynamicProgramming;

public class LisGfgRec {

	static int max_ref; // stores the LIS
	 
	   /* To make use of recursive calls, this function must return
	   two things:
	   1) Length of LIS ending with element arr[n-1]. We use
	      max_ending_here for this purpose
	   2) Overall maximum as the LIS may end with an element
	      before arr[n-1] max_ref is used this purpose.
	   The value of LIS of full array of size n is stored in
	   *max_ref which is our final result */
	   static int _lis(int arr[], int n)
	   {
	       if (n == 1)
	           return 1;
	 
	       int res, max_ending_here = 1;
	 
	        for (int i = 1; i < n; i++)
	        {
	            res = _lis(arr, i);
	            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
	                max_ending_here = res + 1;
	        }
	 
	        if (max_ref < max_ending_here)
	           max_ref = max_ending_here;
	 
	        return max_ending_here;
	   }
	 
	    static int lis(int arr[], int n)
	    {
	         max_ref = 1;
	        _lis( arr, n);
	        return max_ref;
	    }
	 
	    // driver program to test above functions
	    public static void main(String args[])
	    {
	    	double start = System.nanoTime();
	    	
	        int arr[] = {10,22,9,33,21,50,41,60,80};
	        int n = arr.length;
	        System.out.println("Length of lis is "
	                           + lis(arr, n) + "\n");
	        
	        double end = System.nanoTime();
	    	double time = (end - start)/Math.pow(10, 6);
	    	
	    	System.out.println("Time taken to execute program in ms : "+time);
	    }
}
