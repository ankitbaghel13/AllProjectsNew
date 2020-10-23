package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicOperations {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(5,10,15,20,30,25));
		System.out.println("Original List - "+list);
		
		filteringWithoutStreams(list);
		filteringWithStreams(list);

		System.out.println("\nOriginal List - "+list);
		mappingWithoutStreams( list);
		mappingWithStreams(list);

		countFilter(list);
		
		sortedStream(list);
		
		minMax(list);
		
		forEachUsingStream(list);
		
		toArray(list);
		
		streamOf(list);
	}

	private static void streamOf(List<Integer> list) {
		
		Stream<Integer> integerStream = Stream.of(9,99,999,9999,99999);
		System.out.println("\nCreating stream of integers using Stream.of");
		integerStream.forEach(i->System.out.print(i+" "));
	
		Double[] doubleArray = {10.1,10.2,10.3,10.4,10.5};
		Stream<Double> doubleStream = Stream.of(doubleArray);
		System.out.println("\nCreating stream of doubles using Stream.of");
		doubleStream.forEach(i->System.out.print(i+" "));
	
	}

	private static void toArray(List<Integer> list) {
		
		Integer[] intArray = list.stream().toArray(Integer[]::new);
		
		System.out.println("Conversion to int array using streams");
		for(Integer i : intArray)
			System.out.print(i+" ");
		
	}

	private static void forEachUsingStream(List<Integer> list) {
	
		list.stream().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//Method refernce
		list.stream().forEach(System.out::print);
		System.out.println();
	}

	private static void minMax(List<Integer> list) {
	
		Integer min = list.stream().min((a,b)->b.compareTo(a)).get();
		System.out.println("Min integer is : "+min);
		
		Integer max = list.stream().max((a,b)->b.compareTo(a)).get();
		System.out.println("Max integer is : "+max);
	}

	public static void sortedStream(List<Integer> list) {
		//sorting in natural order using streams
		List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("List after sorting : "+newList);
		
		//sorting in natural order using streams
		newList = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("List after sorting in reverse order : "+newList);
	}

	public static void countFilter(List<Integer> list) {
		//count of filtered elements
		long count = list.stream().filter(i->i>15).count();
		System.out.println("Count of elements with value > 15 is : "+count);
	}

	private static void mappingWithStreams(List<Integer> list) {
		
		List<Integer> newList = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("Mapping with Streams - "+newList);
	}

	private static void mappingWithoutStreams(List<Integer> list) {

		List<Integer> newList = new ArrayList<>();

		for(Integer i : list)
			newList.add(i*2);

		System.out.println("Mapping without Streams - "+newList);
	}

	private static void filteringWithStreams(List<Integer> list) {
		
		List<Integer> newList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Filtering with Streams - "+newList);
	}

	private static void filteringWithoutStreams(List<Integer> list) {
		
		List<Integer> newList = new ArrayList<>();
		
		for(Integer i : list){
			if(i%2==0)
				newList.add(i);
		}
		
		System.out.println("Filtering without Streams - "+newList);
	}

	

}
