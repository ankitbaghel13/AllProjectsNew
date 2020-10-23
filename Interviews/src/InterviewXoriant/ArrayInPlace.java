package InterviewXoriant;
/* Save this in a file called Main.java to compile and test it */

import java.util.*;
import java.io.*;

public class ArrayInPlace {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Do not make any changes outside this method.
         *
         * Modify this method to process `array` as indicated
         * in the question. At the end, return the size of the
         * array. 
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
    	ListIterator<Integer> li = array.listIterator();
    	Integer next;
    	Integer counter=0;
    	Integer previousCtr=0;
    	Integer originalCtr=0;
    	while(li.hasNext()) {
    		next = li.next();
    		counter=0;
    		previousCtr=0;
    		originalCtr=0;
    		while(next>=100) {
    			counter++;
    			if(li.hasNext())
    				next = li.next();
    			else
    				break;
    		}
    		if(counter>1) {
    			previousCtr = counter;
    			originalCtr = counter;
    			while(previousCtr>=0) {
    				li.previous();
    				previousCtr--;
    			}
    			while(counter>0) {
    				li.remove();
    				li.next();
    				counter--;
    			}
    			li.previous();
    			li.add(originalCtr);
    		}
    	}
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length; i++)
            System.out.println(arrayList.get(i));
    }
}
