package stringProblems;
import java.util.Scanner;

public class CheckForSubsequence {
	public static void main (String[] args) {
		//code
		
		Scanner scanner = new Scanner(System.in);
		
		int count = Integer.valueOf(scanner.nextLine());
		String complete;
		String cArray[] = new String[2];
		
		for(int i=0;i<count;i++){
		    complete = scanner.nextLine();    
		    cArray = complete.split(" ");
		    checkForSubsequence(cArray[1],cArray[0]);
		}
		
		scanner.close();
	}
	
	public static void checkForSubsequence(String str,String subSeq){
	    
	    int j=0;
	    
	    for(int i=0;i<str.length()&&j<subSeq.length();i++){
	        if(str.charAt(i)==subSeq.charAt(j)){
	            j++;
	        }
	        
	    }
	    if(j==subSeq.length()){
	    	System.out.println("1");
	    }
	    else{
	    	System.out.println("0");
	    }
	}
}