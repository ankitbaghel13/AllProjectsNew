package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class C {

	
	//   Parent     Parent
	// A  --->   B   --->  C
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<A> listA = new ArrayList<>();
		List<B> listB = new ArrayList<>();
		List<C> listC = new ArrayList<>();
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		listB.add(b);
		listB.add(a);
		//1. Only child class elements can come
		//ClassCastException
		//listB.add((B)c);
		
		
		//compilation error
		//2. full lists cannot be assigned
		//listB = listA;
		
		List<? extends B> upperBoundListB = new ArrayList<>();
		
		upperBoundListB = listA;
		upperBoundListB = listB;
		//compilation error
		//3. Upper bound allows only child class type lists
		//upperBoundListB = listC;
		
		
		
		List<? super B> lowerBoundListB = new ArrayList<>();

		//compilation error
		//3. Lower bound allows only parent class type lists
		//lowerBoundListB = listA;
		lowerBoundListB = listB;
		lowerBoundListB = listC;
		
		
		//compilation error -
		//4. we can't add any element to u.b. generics appart from null
		/*upperBoundListB.add(a);
		upperBoundListB.add(b);
		upperBoundListB.add(c);*/
		upperBoundListB.add(null);
		
		
		lowerBoundListB.add(a);
		lowerBoundListB.add(b);
		//compilation error - 
		//5. we can add only child class elements 
		//lowerBoundListB.add(c);
		lowerBoundListB.add(null);
		
		//////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////
		//real time use cases
		List<? extends Integer> upperBoundNumberList = new ArrayList<>();
		List<? super Integer> lowerBoundNumberList = new ArrayList<>();
		
		
		//compilation error bcoz we can't add elements to upper bound wildcard generics
		//upperBoundListB.add(b);
		upperBoundNumberList.add(null);
		
		lowerBoundNumberList.add(5);
		
		List<Integer> ints = new ArrayList<>();
		List<? extends Number> listNumberWC = new ArrayList<>();
		List<Number> listNumber = new ArrayList<>();
		
		listNumberWC = ints;
		//compilation error full lists cannot be assigned
		//listNumber = ints;
		
		
	}

}
