import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG1 {

	public static void main(String[] args) {
		
		String str = "dogedopedose";
		
		Pattern p = Pattern.compile("do.e");
		Matcher m = p.matcher(str);
		
		int count=0;
		
		while(m.find())
			count++;
		
		System.out.println(count);
		
	}

}
