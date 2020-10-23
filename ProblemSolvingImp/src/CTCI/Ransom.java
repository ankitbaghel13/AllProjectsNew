package CTCI;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ransom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}

		HashMap<String, Integer> mapMagazine = new HashMap<String, Integer>();
		HashMap<String, Integer> mapRansom = new HashMap<String, Integer>();

		mapMagazine = getMap(magazine);
		mapRansom = getMap(ransom);

		printMap(mapMagazine);
		printMap(mapRansom);

		boolean flag = true;

		for (int i = 0; i < n; i++) {
			if (!mapMagazine.containsKey(ransom[i])
					|| mapRansom.get(ransom[i]) > mapMagazine.get(ransom[i])) {
				flag = false;
				break;
			}
		}
		// System.out.println(count);
		if (flag == true)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		in.close();

	}

	private static void printMap(HashMap<String, Integer> mapMagazine) {

		for (Entry<String, Integer> entry : mapMagazine.entrySet()) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
		}
		System.out.println();
	}

	public static HashMap<String, Integer> getMap(String[] str) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {
			if (map.containsKey(str[i]))
				map.put(str[i], map.get(str[i]) + 1);
			else
				map.put(str[i], 1);
		}

		return map;
	}
}
