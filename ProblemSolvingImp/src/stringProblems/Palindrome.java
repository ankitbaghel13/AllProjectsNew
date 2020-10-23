package stringProblems;

public class Palindrome {

	
	public static void main(String[] args) {

		/*System.out.println("Please enter the word : ");
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str = scanner.nextLine();

		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str));*/
		//System.out.println(isPalindrome(35335));
	}
	
	private static String isPalindrome(int i) {

		int temp = i;
		int sum = 0;
		while(i>0){
			sum = sum*10 + i%10;
			i = i/10;
		}

		if(temp == sum ){
			return temp+" is palindrome";
		}
		else{
			return temp+" is not palindrome";
		}


	}

	private static String isPalindrome(String str1) {



		if(str1.length() == 0){
			return "Please enter proper input";
		}
		String str = str1.toLowerCase();
		int length = str.length();
		int count = 0;
		for(int i=0,j=length-1;i<length/2 && j>(length/2)-1;i++,j--){
			if(str.charAt(i) == str.charAt(j)){
				count++;
			}
			else{
				break;
			}
		}

		if(count == length/2){
			return str1+" is palindrome";
		}
		else{
			return str1+" is not palindrome";
		}
	}
}
