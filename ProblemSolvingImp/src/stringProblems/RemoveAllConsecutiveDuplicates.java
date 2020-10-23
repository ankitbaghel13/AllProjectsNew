package stringProblems;

public class RemoveAllConsecutiveDuplicates {

	public static void main(String[] args) {

		String input = "geeksforgeeks";
		//"geeksforgeeks"
		System.out.println(removeConsecutiveDulicates(input));
	}

	private static StringBuffer removeConsecutiveDulicates(String input) {
		
		StringBuffer sb = new StringBuffer();
		//sb.append(input.charAt(0));
		int i=0;
		int j=0;
		while(i<input.length()) {
			j=i+1;
			while(j<input.length() && input.charAt(i)==input.charAt(j)) 
				j++;
			sb.append(input.charAt(i));
			i=j;
		}
		
		return sb;
	}

}
