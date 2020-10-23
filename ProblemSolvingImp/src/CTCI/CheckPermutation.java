package CTCI;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {

		String str1 = "ankit!a";
		String str2 = "kitan!a";
		
		//System.out.println(sortingMethod(str1,str2));
		System.out.println(intArray(str1, str2));
	}

	private static boolean sortingMethod(String str1, String str2) {

		if(str1.length()!=str2.length())
			return false;
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(String.valueOf(c1)+" "+String.valueOf(c2));
		
		//return String.valueOf(c1).equals(String.valueOf(c2));
		
		//For equalsIgnoreCase
		return String.valueOf(c1).equalsIgnoreCase(String.valueOf(c2));
	}
	
	
	private static boolean intArray(String str1, String str2) {

		if(str1.length()!=str2.length())
			return false;
		
		int[] letters = new int[128];
		
		for(char ch : str1.toCharArray())
			letters[ch]++;
		
		for(int i=0;i<str2.length();i++){
			letters[str2.charAt(i)]--;
			
			if(letters[i]<0)
				return false;
		}
		
		return true;
	}
	
	

}
