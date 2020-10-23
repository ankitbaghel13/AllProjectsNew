package string.Search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class PatternMatchingMine {

	public static void main(String[] args) {

		/*
		 * String str1 = "hello"; String str2 = "ohell";
		 * 
		 * System.out.println(isRotation(str1,str2));
		 */

		// byte i = 127;

		// removeDuplicates("AAABBBCCDDE");
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		// System.out.println(containsMethod("helloworld", "low"));

		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println(endTime - startTime);
		System.out.println(containsMethod1("helooooworldl", "oow"));
	}

	private static boolean containsMethod1(String mainStr, String conString) {

		int mainLen = mainStr.length();
		int conLen = conString.length();

		for (int i = 0, j = 0; i < mainLen; i++) {
			if (mainStr.charAt(i) == conString.charAt(j))
				j++;
			else if (j > 0) {
				j = 0;
				i--;
			}
			if (j == conLen)
				return true;
		}

		return false;
	}

	private static boolean containsMethod(String mainStr, String conString) {

		char ch = conString.charAt(0);
		List list = new ArrayList();
		boolean flag = true;
		int count = 0;

		for (int i = 0; i < mainStr.length(); i++) {
			if (mainStr.charAt(i) == ch) {
				list.add(i);
			}
		}

		for (Iterator iterator = list.iterator(); iterator.hasNext() && flag;) {
			Integer j = (Integer) iterator.next();
			count = 0;

			for (int i = j, k = 0; i <= j + conString.length()
					&& i < mainStr.length() && k < conString.length(); i++, k++) {
				if (mainStr.charAt(i) == conString.charAt(k))
					count++;
				else
					break;
			}

			if (count == conString.length()) {
				flag = false;
				return true;
			}

		}

		return false;
	}

	private static void removeDuplicates(String string) {

		char[] ch = string.toCharArray();

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next());

		}

	}

	private static boolean isRotation(String str1, String str2) {

		return (str1.length() == str2.length()) && (str2 + str2).contains(str1);

	}

}
