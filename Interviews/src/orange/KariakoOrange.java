package orange;

import java.util.Scanner;

public class KariakoOrange {

	/*
	 * 			end  jump     calc(last step jump-2nd last step jump)
	 * 			pos
	 * Step 0 : 0
	 * Step 1 : 1   (+1)
	 * Step 2 : -1  (-2)      
	 * Step 3 : -4  (-3)      -2-1
	 * Step 4 : -5  (-1)      -3-(-2) 
	 * Step 5 : -3  (2)       -1-(-3)
	 */
	public static void main(String[] args) {

		int n= new Scanner(System.in).nextInt(); 
		int firstValue=1;
		int secondValue=-2;
		int temp;
		int output=-1;
		for(int i=3;i<=n;i++){
			
			temp = secondValue-firstValue;
			output += temp;
			
			firstValue = secondValue;
			secondValue = temp;
		}
		
		System.out.println(output);
		
		//prints 9
		/*int i=9;
		int j=10;
		j =+ i;
		System.out.println(j);*/
		
	}

}
