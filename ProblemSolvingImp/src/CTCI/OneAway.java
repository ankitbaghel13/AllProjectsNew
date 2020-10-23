package CTCI;

public class OneAway {

	public static void main(String[] args) {

		String str1 = "pale", str2 = "bake";
		System.out.println(isEdit(str1, str2));
	}

	private static boolean isEdit(String str1, String str2) {

		int count = 0;

		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i))
					count++;

				if (count > 1)
					return false;
			}

		}
		
		else if (Math.abs(str1.length()-str2.length())==1) {
			for (int i = 0,j=0; i < str1.length()&&j<str2.length(); i++,j++) {
				if (str1.charAt(i) != str2.charAt(j)){
					if(str1.length()>str2.length())
						j--;
					else 
						i--;
					count++;
					
					if (count > 1)
						return false;
				}
				
			}
		}
		
		else if (Math.abs(str1.length()-str2.length())>1)
			return false;
		
		return true;
	}

}
