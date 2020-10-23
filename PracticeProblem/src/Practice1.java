import java.util.Map;
import java.util.TreeMap;

public class Practice1 {

	public static void main(String[] args) {

		String str = "this_is_a_var";
		String str1 = "thisIsAVar";
		
		//convertToJavaStyle(str);
		
		//convertToCPlusPlus(str1);
		
		String str2 = "ashishgupta";
		findCountInAscendingOrder(str2);
		
		
		
		
	}

	private static void findCountInAscendingOrder(String str) {
	
		Map<Character,Integer> charCountMap = new TreeMap<>();
		char[] chArray = str.toCharArray();
		
		for(char ch : chArray) {
			if(!charCountMap.containsKey(ch))
				charCountMap.put(ch, 1);
			else
				charCountMap.put(ch, charCountMap.get(ch)+1);
		}
		
		System.out.println(charCountMap);
	}

	private static void convertToCPlusPlus(String str) {
		
		char[] chArray = str.toCharArray();
		char current;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<chArray.length;i++) {
			current = chArray[i];
			if(Character.isUpperCase(current)) {
				sb.append('_');
				sb.append(Character.toLowerCase(current));
			}else {
				sb.append(current);
			}
				
		}
		System.out.println(new String(sb));
	}

	private static void convertToJavaStyle(String str) {
		char[] chArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		Character curr;
		boolean toUpper=false;
		for(int i=0;i<chArray.length;i++) {
			
			curr = chArray[i];
			if(toUpper) {
				sb.append(Character.toUpperCase(curr));
				toUpper = false;
				continue;
			}
			toUpper = false;
			if(curr=='_') {
				toUpper = true;
			}else {
				sb.append(curr);
			}
		}
		
		System.out.println(new String(sb));
	}

}
