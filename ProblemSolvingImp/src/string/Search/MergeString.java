package string.Search;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(scanner.nextLine());
		String[] strArray = new String[2];
		
		
		for(int i=0;i<noOfTestCases;i++){
			
			strArray = scanner.nextLine().split(" ");
			merge(strArray);
		}
		
		scanner.close();
	}

	private static void merge(String[] strArray) {

		String str1 = strArray[0];
		String str2 = strArray[1];
		String str3 = "";
		int i,j = 0;
		
		for(i=0,j=0;i<str1.length()&&j<str2.length();i++,j++){
			
			str3 += str1.charAt(i)+""+str2.charAt(j);
		}
		if(i!=str1.length()){
			str3 += str1.substring(i,str1.length()); 
		}
		if(j!=str2.length()){
			str3 += str2.substring(j,str2.length()); 
		}
		
		System.out.println(str3);
	}

}
