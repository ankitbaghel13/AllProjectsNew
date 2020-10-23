package gs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BalancedParanthesisGetClosingBrackPos {

	public static void main(String[] args) {

		String str = "I (am so (confused) which )paranthesis (is where opening or closing)";
		int length = str.length();

		Map< Integer, Integer> map = new TreeMap<Integer, Integer>();

		//char c = "(";

		List<Integer> listf = new ArrayList<Integer>();
		List<Integer> listr = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			if(str.charAt(i)=='('){
				listf.add(i);
			}
			if(str.charAt(i)==')'){
				listr.add(i);
			}
		}

		System.out.println(listf+" "+listr);

		int listlen = listf.size();

		for (int j = 0; j < listlen; j++) {
			for (int i = 0; i < listf.size(); i++) {
				
				if(listr.get(0)<listf.get(i)){
					map.put(listf.get(i-1), listr.get(0));
					listf.remove(i-1);
					listr.remove(0);
					break;
				}
				if(i==listf.size()-1){
					map.put(listf.get(i), listr.get(0));
					listf.remove(i);
					listr.remove(0);
					break;
				}

			}
			System.out.println(listf+" "+listr);
		}
		
		
		System.out.println(map);
		
		
	}

}
