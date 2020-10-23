package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

	/*public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		map.values();
		
		int i = 010;
		int j = 8;
		System.out.println(i+" "+j+" "+i/2);
		
		List<Integer> x = new ArrayList<>();
		
		x.add(3);
		x.add(5);
		x.add(7);
		updateList(x);
		x.add(10);
		
		System.out.println(x);
		
		
	}

	private static void updateList(List<Integer> x) {
		
		x = new ArrayList<>();
		x.add(9);
		//return x;
	}*/
		
	public static void swap(Integer i, Integer j)  
	{ 
		Integer temp = new Integer(i); 
		i = j; 
		j = temp; 
	} 
	public static void main(String[] args)  
	{ 
		/*Integer i = new Integer(10); 
		Integer j = new Integer(20); 
		swap(i, j); 
		System.out.println("i = " + i + ", j = " + j);*/ 
		
		long result = repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", 549382313570l);
		System.out.println(result);
	} 
	
	static long repeatedString(String s, long n) {

        char[] ch = s.toCharArray();
        long count=0;
        long aCount=0;

        for(char c : ch)
            if(c=='a') count++;
        
        aCount = count*(n/s.length());
        long rem = n%(s.length());

        for(int i=0;i<rem;i++){
            if(ch[i]=='a')
                    aCount++;
        }

        return aCount;
    }

}
