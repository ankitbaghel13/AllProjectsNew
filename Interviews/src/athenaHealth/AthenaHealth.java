package athenaHealth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author Ankit
 *
 */
public class AthenaHealth {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int noOfTweets = scanner.nextInt();
		int noOfHT = scanner.nextInt();
		int counter = 0;

		/*String str1 = "#Rahul century in first match #INDvsWI #TestMatch";
		String str2 = "#INDvsWI gonna be #washout #TestMatch series for #WI #INDRockz";
		String str3 = "FIFTY for Wriddhiman Saha! His third in Tests. Gets there in 135 balls!";
		String str4 = "#GST passed in parliment. Good move from #INDGov #INDRockZ";

		String str = str1 + " " + str2 + " " + str3 + " " + str4 + " ";*/

		String str = "";
		for (int i = 0; i <= noOfTweets; i++) {
			str = str.concat(scanner.nextLine() + " ");
		}

		List<String> list = getHashTag(str);

		Map<String, Integer> map = getKeyCount(list);
		map = sortByValue(map);

		// System.out.println(map);

		for (Entry<String, Integer> entry : map.entrySet()) {

			counter++;
			if (counter <= noOfHT) {
				System.out.println("#" + entry.getKey());

			} else
				break;

		}

		scanner.close();

	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> map) {

		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(
				map.entrySet());
		Collections.sort(list, new KeyValue());

		/*
		 * for (Entry<String, Integer> entry1 : list)
		 * System.out.println(entry1.getKey() + " : " + entry1.getValue());
		 */

		Map<String, Integer> resultMap = new LinkedHashMap<>();

		for (Entry<String, Integer> entry2 : list)
			resultMap.put(entry2.getKey(), entry2.getValue());

		return resultMap;
	}

	private static Map<String, Integer> getKeyCount(List<String> list) {

		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < list.size(); i++) {

			if (map.containsKey(list.get(i)))
				map.put(list.get(i), map.get(list.get(i)) + 1);
			else
				map.put(list.get(i), 1);

		}

		List<String> lowerCaseListKey = new ArrayList<>(map.keySet());
		for (int i = 0; i < lowerCaseListKey.size(); i++) {
			for (int j = i + 1; j < lowerCaseListKey.size(); j++) {
				if (lowerCaseListKey.get(i).equalsIgnoreCase(
						lowerCaseListKey.get(j))) {
					map.replace(lowerCaseListKey.get(i),
							map.get(lowerCaseListKey.get(i)) + 1);
					map.remove(lowerCaseListKey.get(j));
				}
			}
		}

		return map;
	}

	public static List<String> getHashTag(String str1) {
		String temp = null;
		int space = 0;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '#') {
				for (int j = i; j < str1.length(); j++) {
					if (str1.charAt(j) == ' ') {
						space = j;

						break;
					}
				}
				temp = str1.substring(i + 1, space);
				i = space;
				list.add(temp);
			}
		}

		/*
		 * for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		 * String string = (String) iterator.next(); System.out.print(string +
		 * " "); }
		 */

		return list;
	}
}

class KeyValue implements Comparator<Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

		int count = 0;
		/*if (o1.getValue() > o2.getValue())
			count = -1;
		else if (o1.getValue() == o2.getValue()) {
			return o1.getKey().compareTo(o2.getKey());
		} else
			count = 1;

		return count;*/
		
		if(o1.getValue() == o2.getValue())
			return o1.getValue().compareTo(o2.getValue());
		else
			return o1.getKey().compareTo(o2.getKey());
	}

}
