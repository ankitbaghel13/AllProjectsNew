package CTCI;

public class PalindromePermutation {

	public static void main(String[] args) {

		String str = "ankitenAkit";
		System.out.println("\n"+isPalindrome(str.toLowerCase()));
	}

	private static boolean isPalindrome(String str) {

		int[] intArray = new int[26];
		boolean foundOdd = false;
		
		for(char ch : str.toCharArray()){
			
			int num = ch;
			if('a'<=num && num<='z')
				intArray[num - 'a']++;
		}
		
		printIntArray(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]%2==1){
				if(foundOdd)
					return false;
				foundOdd = true;
			}
		}
		
		return true;
		
		/*if((str.length()==0 && count==0) || (str.length()!=0 && count==1))
			return true;
		
		return false;*/
	}

	private static void printIntArray(int[] intArray) {

		for (int i = 0; i < intArray.length; i++) {
			System.out.print((char)(i+97)+" : "+intArray[i]+"\t");
		}
	}

}
