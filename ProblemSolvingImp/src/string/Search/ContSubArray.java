package string.Search;

import java.util.Scanner;

public class ContSubArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int noOfTestCases = Integer.parseInt(scanner.nextLine());
		
		String[] stringArray;
		String[] lengthAndProductArray;
		int length;
		int product;
		
		for(int i=0;i<noOfTestCases;i++){
			
			lengthAndProductArray = scanner.nextLine().split(" ");
			length = Integer.parseInt(lengthAndProductArray[0]);
			product = Integer.parseInt(lengthAndProductArray[1]);
			
			stringArray = scanner.nextLine().split(" ");
			
			getCountSubArray(stringArray,length,product);
		} 
		
		
		scanner.close();
	}

	private static void getCountSubArray(String[] stringArray,Integer length,Integer product) {

		int count = 0;
		int result;
		for(int n=1;n<length;n++){
			for(int i=0;i<=length-n;i++){
				result = 1;
				for(int j=i;j<i+n;j++){
					result = result*Integer.parseInt(stringArray[j]);
				}
				
				if(result<product)
					count++;
			}
		}	
		
		System.out.println(count);
	}

}
