package prefix.Sum;

import java.util.Scanner;

public class ArrayImplementation {

	
	/* Sample Input

	5 3
	1 2 100
	2 5 100
	3 4 100
	
	Sample Output
	
	200
	
	Explanation
	
	After first update list will be 100 100 0 0 0. 
	After second update list will be 100 200 100 100 100.
	After third update list will be 100 200 200 200 100.
	So the required answer will be 200.*/
	
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        long[] arr = new long[n+1];
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            arr[a-1] += k;
            if(b<n)
            	arr[b] -= k;
        }
        long max = 0;
        long temp = 0;
        for(int i=0;i<arr.length;i++){
            
            temp += arr[i];
            if(temp>max)
                max = temp;
        }
        
        System.out.println(max);
        
        in.close();
    
	}

}
