package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyOperations {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		//int sum = list.stream().mapToInt(i->i).sum();
		int sum = list.stream().min((a,b)->a-b).get();
		System.out.println(sum);
		
		List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(10000),new Employee(20000),new Employee(30000)));
		
		int salarySum = empList.stream().filter(i->i.sal>15000).mapToInt(i->i.sal).sum();
		
		System.out.println(salarySum);
	}

}
