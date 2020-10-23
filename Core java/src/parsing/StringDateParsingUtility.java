package parsing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class StringDateParsingUtility {

	public static void main(String[] args) throws ParseException {

		subString();
		iteratingCollections();
		parsingStringToOthers();
		parsingDate();
		convertingOthersToString();

	}


	public static void subString() {
		
		// Substring
		// =================================================================================
		
		String str = "Ankit";
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(1));

		CharSequence ch = str.subSequence(2, 4);
		System.out.println(ch);
		
	}

	public static void iteratingCollections() {

		// Iterating through Set
		// =================================================================================
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("Ankit");
		set.add("Punit");
		set.add("Tarun");
		set.add("Mohit");

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string + ", ");

		}

		
		// Iterating through Map
		// =================================================================================
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		map.put("Ankit", 1);
		map.put("Punit", 2);
		map.put("Tarun", 3);
		map.put("Mohit", 4);
		System.out.println();

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
		}
	}
	

	private static void convertingOthersToString() {

		
		//ValueOf int to String
		// =================================================================================

		int i=200;  
		String s=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);
		
		//public **static** String valueOf(boolean b)  
		//public **static** String valueOf(char c)  
		//public **static** String valueOf(char[] c)  
		//public **static** String valueOf(int i)  
		//public **static** String valueOf(long l)  
		//public **static** String valueOf(float f)  
		//public **static** String valueOf(double d)  
		//public **static** String valueOf(Object o)
		
		System.out.println(Integer.valueOf(i).toString()+500);
		
		
		// Formatting Date to String
		// =================================================================================

		Date date = new Date();
		SimpleDateFormat formatter7 = new SimpleDateFormat("dd MMMM yyyy zzzz");
		String strDate = formatter7.format(date);
		System.out.println("Date Format with dd MMMM yyyy zzzz : " + strDate);
		
	}

	public static void parsingStringToOthers() {

		// Parse String to int,float,long,double etc
		// =================================================================================
		
		String str2 = "23";

		int a = Integer.parseInt(str2);
		float f = Float.parseFloat(str2);
		long l = Long.parseLong(str2);
		double d = Double.parseDouble(str2);

		System.out.println("Integer is : " + a);
		System.out.println("Float is : " + f);
		System.out.println("Long is : " + l);
		System.out.println("Double is : " + d);
		

		// valueOf method for String to Integer
		// =================================================================================
		// parseInt() returns primitive integer type (int), whereby valueOf
		// returns java.lang.Integer, which is the object representative of the
		// integer

		Integer an = Integer.valueOf(str2);
		System.out.println("Integer is : "+an);
		

		// String to char array
		// =================================================================================
		
		String str1 = "Ankit baghel";
		char[] c = str1.toCharArray();

		System.out.println(c);
		

		
	}
	
	private static void parsingDate() throws ParseException {
		// Parsing String to Date
		// =================================================================================
		// Notice that formatting means converting date to string and
		// parsing means converting string to date.
		
		String sDate1 = "31/12/2016";
		String sDate2 = "31-Dec-2016";
		String sDate3 = "12 31, 2016";
		String sDate4 = "Thu, Dec 31 2016";
		String sDate5 = "Thu, Dec 31 2016 23:37:50";
		String sDate6 = "31-Dec-2016 23:37:50";

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat formatter3 = new SimpleDateFormat("MM dd, yyyy");
		SimpleDateFormat formatter4 = new SimpleDateFormat("E, MMM dd yyyy");
		SimpleDateFormat formatter5 = new SimpleDateFormat(
				"E, MMM dd yyyy HH:mm:ss");
		SimpleDateFormat formatter6 = new SimpleDateFormat(
				"dd-MMM-yyyy HH:mm:ss");

		Date date1 = formatter1.parse(sDate1);
		Date date2 = formatter2.parse(sDate2);
		Date date3 = formatter3.parse(sDate3);
		Date date4 = formatter4.parse(sDate4);
		Date date5 = formatter5.parse(sDate5);
		Date date6 = formatter6.parse(sDate6);

		System.out.println(sDate1 + "\t" + date1);
		System.out.println(sDate2 + "\t" + date2);
		System.out.println(sDate3 + "\t" + date3);
		System.out.println(sDate4 + "\t" + date4);
		System.out.println(sDate5 + "\t" + date5);
		System.out.println(sDate6 + "\t" + date6);
		


		// Printing dates
		// =================================================================================
		
		Date dateN = new Date();
		System.out.println(dateN);

		long millis = System.currentTimeMillis();
		java.sql.Date sqlDate = new java.sql.Date(millis);
		System.out.println(sqlDate);

		Date calenderDate = Calendar.getInstance().getTime();
		System.out.println(calenderDate);
	}
}
