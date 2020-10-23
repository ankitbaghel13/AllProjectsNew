package my;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapComparatorByValues {

	public static void main(String[] args) {

		//Map<Integer, Integer> map = new TreeMap<>(new ValueComparator(map));
	}

}
class ValueComparator implements Comparator<Integer> {

    private Map<Integer, String> map;

    public ValueComparator(Map<Integer, String> map) {
        this.map = map;
    }

    public int compare(Integer a, Integer b) {
        return map.get(a).compareTo(map.get(b));
    }
}
