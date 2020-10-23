
//Initial Template for Java
import java.util.*;
//Position this line where user code will be pasted.
public class GFG{
    
    // Driver Code
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        // Testcase Input
        int t = sc.nextInt();
        
        // Iterating through all testcase input
        while(t-- > 0){
            
            long N = sc.nextLong();
            long X = sc.nextLong();
            
            GfGFunction g = new GfGFunction();
            
            g.findJumps(N, X);
            
        }
        
    }
    
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class GfGFunction{
    
    // Function to find number of jumps
    // N : number inscribed on the last stone.
    // X : number on which we have to reach
    static void findJumps(long N, long X){
        
        // Your code goes here
         
         if(X==1 || ((N%2==0) && (N-X)==0)
            || ((N%2!=0) && (N-X)<=1 )){
               System.out.println(0);
            } 
        else if(X < (N-X) )
            System.out.println(X/2);
        else
            System.out.println((N-X)/2);
    }
    
}