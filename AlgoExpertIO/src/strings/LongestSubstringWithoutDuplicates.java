package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {

	public static void main(String[] args) {
		
		String input = "clementisacap";
		System.out.println(longestSubstringWithoutDuplicates(input));
	}

	private static String longestSubstringWithoutDuplicates(String input) {
		
		int startIndex = 0;
		int maxLength = 0;
		int currLength = 0;
		String longestSubstring=null;
		Map<Character,Integer> positionMap = new HashMap<>();
		Character currentChar;
		for(int i=0;i<input.length();i++) {
			currentChar = input.charAt(i);
			if(positionMap.containsKey(currentChar))
				startIndex = Math.max(startIndex, positionMap.get(currentChar)+1);
			positionMap.put(currentChar, i);
			
			currLength = i+1-startIndex;
			if(currLength > maxLength) {
				maxLength = currLength;
				longestSubstring = input.substring(startIndex, i+1);
			}
		}
		return longestSubstring;
	}
}
