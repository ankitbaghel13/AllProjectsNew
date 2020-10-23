package string.Search;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountWordsParagraph {

	public static void main(String[] args) throws IOException {

		
		String str = new String(Files.readAllBytes(Paths.get("new.txt")));
		System.out.println(str);
		
		//sortByValuesListMethod(str);
		
		sortByTreeMapMethod(str);
	}

	private static void sortByTreeMapMethod(String str) {

		String[] strArray = str.split(" ");
		
		Map<String,Integer> map = new TreeMap<String,Integer>(
				new Comparator<String>() {
					
					public int compare(String s1,String s2) {
						return s1.compareTo(s2);
					}
				});
		
		for(int i=0;i<strArray.length;i++){
			
			if(!map.containsKey(strArray[i]))
				map.put(strArray[i], 1);
			else
				map.put(strArray[i], map.get(strArray[i])+1);
		}
	}

	public static void sortByValuesListMethod(String str) throws IOException {
		
		String[] strArray = str.split(" ");
		
		Map<String,Integer> map = new TreeMap<>();
		
		for(int i=0;i<strArray.length;i++){
			
			if(!map.containsKey(strArray[i]))
				map.put(strArray[i], 1);
			else
				map.put(strArray[i], map.get(strArray[i])+1);
		}
		
		Set<Entry<String,Integer>> set = map.entrySet();
		
		List<Entry<String,Integer>> list = new ArrayList<>(set);
		Collections.sort(list,new Comparator<Entry<String,Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getKey()+"--"+list.get(i).getValue());
		}
	}

}
