package string.Search;

public class PatternMatching {

	public static void main(String[] args) {

		String str = "AABAACAADAABAAABAA";
		String pattern = "AABA";
		
		/*String str1 = new String("abcd");
		String str2 = "abcd";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);*/
		
		naiveSolution(str, pattern);
	}

	private static void naiveSolution(String str, String pattern) {

		int n=str.length();
		int m=pattern.length();
		int j=0;
		for(int i=0;i<=n-m;i++){

			for(j=0;j<m;j++){
				if(str.charAt(i+j)!=pattern.charAt(j))
					break;
			}
			if(j==m){
				System.out.println("Patterm found at "+i);
			}
		}
	}

}
