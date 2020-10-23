package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
	
	public static void main(String[] args) {
		
		/*Pattern p = Pattern.compile("a.k");
		Matcher m = p.matcher("ank");
		boolean bo = m.matches();
		System.out.println(bo);
		
		boolean b2=Pattern.compile(".s").matcher("as").matches();*/  
		
		//boolean b = Pattern.matches("ank(it)+ ba(gh)?el", "ankitit bael");
		
		//boolean b = Pattern.matches("ank[it]? ba(gh)?el", "ankt bael");
		
		boolean b = Pattern.matches("ankita+", "ankitaaaa");
		
		//boolean b = Pattern.matches("[abc]{3,6}", "abc");
		
		//boolean b = Pattern.matches("[^a-cA-C]", "D");
		
		System.out.println(b);
	}

}
