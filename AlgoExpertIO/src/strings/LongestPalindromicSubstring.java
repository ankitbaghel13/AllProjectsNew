package strings;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		String input = "abaxyzzyxf";
		System.out.println(longestPalindromicSubstring(input));
	}

	private static String longestPalindromicSubstring(String input) {

		int start=0;
		int left=0;
		int right=0;
		int length = input.length();
		int currPalindromeLength=0;
		int maxPalindromeLength=0;
		
		for(int i=0;i<length;i++) {
			//findMaxOddLengthPalindrome
			left = i;
			right = i;
			currPalindromeLength = 0;
			while(left>=0 && right<length && input.charAt(left)==input.charAt(right)) {
				currPalindromeLength = right - left + 1;
				if(currPalindromeLength>maxPalindromeLength) {
					start = left;
					maxPalindromeLength = currPalindromeLength;
				}
				left--;
				right++;
			}
			
			
			//finfMaxEvenLengthPalindrome
			left = i;
			right = i+1;
			currPalindromeLength = 0;
			while(left>=0 && right<length && input.charAt(left)==input.charAt(right)) {
				currPalindromeLength = right - left + 1;
				if(currPalindromeLength>maxPalindromeLength) {
					start = left;
					maxPalindromeLength = currPalindromeLength;
				}
				left--;
				right++;
			}
		}
		
		return input.substring(start, start+maxPalindromeLength);
	}

}
