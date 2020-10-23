package regex;

public class ContainsNumOrAlphabet {

	public static void main(String[] args) {

		String str = "sdfsnf1!";
		
		if(str.matches(".*\\d.*") && str.matches(".*\\w.*"))
			System.out.println("contains both numbers and alphabets");
		else if(str.matches(".*\\d.*"))
			System.out.println("contains only numbers");
		else if(str.matches(".*\\w.*"))
			System.out.println("contains only alphabets");
		else
			System.out.println("doesn't contains anything");
		
		System.out.println(str.replaceAll("\\W", ""));
	}

}
