package ciena;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {

		String input = "00:05:00,234-567-890\n"
				 + "00:05:37,888-999-222\n"
				 + "00:00:37,234-567-890\n"
				 + "00:01:00,234-567-891\n";
	
		//String oldPattern = "(.*?)\\:(.*?)\\:(.*?)\\,(.*?)\\-(.*?)\\-(.*?)\\n";
		String pattern = "(\\d{2})\\:(\\d{2})\\:(\\d{2})\\,(\\d{3})\\-(\\d{3})\\-(\\d{3})\\n";
		
		printMatchers(input,pattern);
		
		/*String input1 = "USA (45)AB (32)";
		String pattern1 = "(.*?)\\s+\\((.*?)\\)";
		
		printMatchers(input1,pattern1);*/
	}

	public static void printMatchers(String input,String patternStr) {
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(input);
		int i = 1;
		
		System.out.println(input);
		while(matcher.find()){
			System.out.print("Record number "+i+" : "+matcher.group(0));
			System.out.println("Call duration = "+matcher.group(1)+" "+matcher.group(2)+" "+matcher.group(3));
			System.out.println("Mob no = "+matcher.group(4)+" "+matcher.group(5)+" "+matcher.group(6));
			System.out.println();
			i++;
		}
	}

}
