package InterviewXoriant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Try {

	public void myBuf (StringBuffer s, StringBuffer s1) {
        s.append ("B");
        s = s1;
    }
    public static void main (String args [ ] ) {
		/*
		 * Try t = new Try(); StringBuffer s = new StringBuffer ("A"); StringBuffer sl =
		 * new StringBuffer ("B"); t.myBuf(s, sl); System.out.print(s);
		 */
    	List<String> array = new ArrayList<>();
    	array.add("22, Rajan Anand, Engineering, 1600000");
    	array.add("23, Swati Patil, Testing, 800000");
    	array.add("27, Vijay Chawda, Engineering, 800000");
    	array.add("29, Basant Mahapatra, Engineering, 600000");
    	array.add("32, Ajay Patel, Testing, 350000");
    	array.add("34, Swaraj Birla, Testing, 350000");
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        Map<String,Integer> deptSalaryMap = new HashMap<String,Integer>();
        String[] strArray;
        String dept;
        Integer salary;
        Integer empId;
        Integer highestSalary;
        for(String str : array) {
        	strArray = str.split(",");
        	empId = Integer.parseInt(strArray[0]);
        	dept = strArray[2];
        	salary = Integer.parseInt(strArray[3].trim());
        	if((deptSalaryMap.get(dept)==null) || (deptSalaryMap.get(dept)<salary)) {
        		deptSalaryMap.put(dept, salary);
        		retVal.put(dept, empId);
        	}
        }
        System.out.println(retVal);
    	
    }
}
