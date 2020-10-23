package string.Search;

public class SubSequence {

	public static void main(String[] args) {
		
		String str = "Ankitbaghel";
		String subSequence = "ntahle";
		
		subSequence(str,subSequence);
	}

	private static void subSequence(String str, String subSequence) {

		int j=0;
		for(int i=0;i<str.length()&&j<subSequence.length();i++){
			if(str.charAt(i)==subSequence.charAt(j))
				j++;
		}
		if(j==subSequence.length())
			System.out.println("True");
		else
			System.out.println("False");
	}

}
