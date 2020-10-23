package InterviewXoriant;
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class HighestSalaryEachDept {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
    	array.clear();
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
       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}

