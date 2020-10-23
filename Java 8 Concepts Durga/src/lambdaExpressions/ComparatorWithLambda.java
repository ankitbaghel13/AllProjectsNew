package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithLambda {
	
	public static void main(String[] args) {
		
		withLambda();
		
		withoutLambda();
		withAnonymousClasses();
		
	}
	
	private static void withAnonymousClasses() {

		System.out.println("**************************************************");
		System.out.println("With anonymous inner classes\n");


		List<String> list = new ArrayList<String>(Arrays.asList("Ankit","Mohit","Rohit"));
		
		System.out.println(list);
		list.sort(new Comparator<String>(){
			
			@Override
			public int compare(String s1, String s2) {
                return s1.compareTo(s2);
			}
		});
		
		System.out.println(list);
		
	}

	public static void withoutLambda() {
		
		System.out.println("**************************************************");
		System.out.println("Without Lambda\n");
		List<String> list = new ArrayList<String>(Arrays.asList("Mohit rohilla","Vaibhav srivastava","Ankit baghel","Rohit srivastava"));

		System.out.println(list);
		list.sort(new StringComparator());
		
		System.out.println(list);
	}

	public static void withLambda() {
		
		System.out.println("**************************************************");
		System.out.println("With Lambda\n");
		List<String> list = new ArrayList<String>(Arrays.asList("Mohit rohilla","Vaibhav srivastava","Ankit baghel","Rohit srivastava"));

		System.out.println(list);
		//list.sort((String s1,String s2)->s2.compareTo(s1));
		//list.sort((s1,s2)->s2.compareTo(s1));

		list.sort((s1,s2)->{
			String firstName1 = s1.split(" ")[0];
			String lastName1 = s1.split(" ")[1];
			
			String firstName2 = s2.split(" ")[0];
			String lastName2 = s2.split(" ")[1];
			
			if(!lastName1.equals(lastName2))
				return lastName1.compareTo(lastName2);
			return firstName1.compareTo(firstName2);
		});
		
		//System.out.println(list);
		/*for (String string : list) {
			System.out.println(string);
		}*/
		//list.forEach(System.out::println);
		list.forEach(s -> System.out.print(s + ","));
	}

}

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		String firstName1 = s1.split(" ")[0];
		String lastName1 = s1.split(" ")[1];
		
		String firstName2 = s2.split(" ")[0];
		String lastName2 = s2.split(" ")[1];
		
		/*if(!lastName1.equals(lastName2))
			return lastName1.compareTo(lastName2);
		return firstName1.compareTo(firstName2);*/
		
		return !lastName1.equals(lastName2) ?  lastName1.compareTo(lastName2) : firstName1.compareTo(firstName2);
		
	}
	
}

