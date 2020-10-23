package CTCI;

public class URLify {

	public static void main(String[] args) {

		String str = "Mr John Smith    ";

		System.out.println(urlifyy(str, 13));
	}

	private static String urlifyy(String str, int trueLength) {

		int i, index, spaceCount = 0;
		char[] ch = str.toCharArray();

		for (i = 0; i < trueLength; i++) {
			if (ch[i] == ' ')
				spaceCount++;
		}

		index = trueLength + spaceCount * 2;

		/*
		 * if(trueLength<str.length()) ch[trueLength] = '\0';
		 */

		for (i = trueLength - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				ch[index - 1] = '0';
				ch[index - 2] = '2';
				ch[index - 3] = '%';
				index = index - 3;
			} else {
				ch[index - 1] = ch[i];
				index--;
			}
		}

		return String.valueOf(ch);
	}
}
