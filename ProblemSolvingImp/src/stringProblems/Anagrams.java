package stringProblems;


public class Anagrams {

	public static void main(String[] args) {

		System.out.println(checkForAnagrams("geeksforgeeks","forgeeksgeeks"));
	}

	private static String checkForAnagrams(String string, String string2) {

		String output = "yes";
		int[] array = new int[256];
		
		if(string.length()!=string2.length())
			return "no";
		
		char[] ch1 = string.toCharArray();
		char[] ch2 = string2.toCharArray();
		
		for (int i = 0; i < ch2.length; i++) {
			array[ch1[i]]++;
			array[ch2[i]]--;
		}
		
		for (int i : array) {
			if(i!=0){
				output = "no";
				break;
			}
		}

		return output;
	}

}
