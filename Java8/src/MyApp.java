import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MyApp {

	public static void main(String[] args) {
		
		

	}
	
	public void method1(){

		List<String> list = new ArrayList<>(Arrays.asList("Ankit","Ankit1","Ankit12"));

		//Predicate
		System.out.println(list.stream().filter(a->a.length()==6).collect(Collectors.toList()));

		//Consumers
		//list.stream().forEach(a->a.concat(" Baghel"));
		//list.forEach(System.out::println);
		list.parallelStream().forEach(a->System.out.print(a+" "));


		//System.out.println(list);
	}

}
