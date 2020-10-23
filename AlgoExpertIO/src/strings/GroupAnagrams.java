package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strArray = new String[] {"yo","act","flop","tac","cat","oy","olfp"};
		Collection<List<String>> result = groupAnagrams(strArray);
		System.out.println(result);
	}

	private static Collection<List<String>> groupAnagrams(String[] inputArray) {
		
		int length = inputArray.length;
		String[] sortedArray = new String[length];
		Map<String, List<String>> mapAnagram = new HashMap<>();
		String currentSorted;
		
		for(int i=0;i<length;i++) {
			sortedArray[i] = sortString(inputArray[i]);
		}
		//{"yo","act","flop","tac","cat","oy","olfp"} - inputArray
		//{"oy","act","flop","act","act","oy","flop"} - sortedArray
		
		List<String> list;
		for(int i=0;i<length;i++) {
			currentSorted = sortedArray[i];
			if(!mapAnagram.containsKey(currentSorted)) {
				list = new ArrayList<>();
				list.add(inputArray[i]);
				mapAnagram.put(currentSorted, list);
			}else
				mapAnagram.get(currentSorted).add(inputArray[i]);
		}
		
		return mapAnagram.values();
	}
	
	public static String sortString(String inputString) { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 

}
