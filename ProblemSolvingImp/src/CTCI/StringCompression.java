package CTCI;

public class StringCompression {

	public static void main(String[] args) {

		String str = "aabcccccaaab";

		System.out.println(compress(str));
	}

	private static String compress(String str) {

		char[] ch = str.toCharArray();
		int count = 1;
		String comp = "";

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == ch[i + 1])
				count++;
			if(ch[i] != ch[i + 1] ){
				comp = comp + ch[i] + count;
				if(i==ch.length-2)
					comp = comp + ch[i+1] + 1;
				count = 1;
			}
		}

		return comp.length()<str.length()?comp:str;
	}

}
