package strings;
import java.util.Arrays;

public class CaeserCipherEncryptor {

	public static void main(String[] args) {

		String input = "xyz";
		System.out.println(doCaeserCipherEncryption(input, 3));
	}

	private static String doCaeserCipherEncryption(String input, int shift) {
		
		char[] inputArray = input.toCharArray();
		char currentChar;
		int asciiValue;
		shift = shift%26;
		
		for(int i=0;i<inputArray.length;i++) {
			currentChar = inputArray[i];
			asciiValue = currentChar;
			asciiValue += shift;
			
			if(asciiValue>122)
				asciiValue = asciiValue-26;
			inputArray[i] = (char)asciiValue;
		}

		return Arrays.toString(inputArray);
	}

}
