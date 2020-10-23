package vmware;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DateConversion {
	

	public static void main(String[] args) {

		/*String str = "Ankit";
		
		str = str.substring(0, str.length()-1);
		System.out.println(str);*/
		
		String[] datesArray = {"20th nov 1992","1st dec 2017","3rd oct 1090"};
		
		String[] resultArray = convertDate(datesArray);
		
		System.out.println(Arrays.toString(resultArray));
	}

	private static String[] convertDate(String[] datesArray) {
		
		String[] date = new String[3];
		String day;
		String month;
		String year;
		
		Map<String,String> monthMap = new HashMap<>();
		
		monthMap = createMap();
		
		for(int i=0;i<datesArray.length;i++){
			
			date = datesArray[i].split(" ");
			
			day = date[0].substring(0, date[0].length()-2);
			
			day =  day.length()!=1  ? day : "0"+day;
			month = monthMap.get(date[1]);
			year = date[2];
			
			datesArray[i] = year+"-"+month+"-"+day;
		}
		
		
		return datesArray;
	}

	private static Map<String,String> createMap() {
		
		Map<String,String> monthMap = new HashMap<>();
		monthMap.put("jan", "01");
		monthMap.put("feb", "02");
		monthMap.put("mar", "03");
		monthMap.put("apr", "04");
		monthMap.put("may", "05");
		monthMap.put("jun", "06");
		monthMap.put("jul", "07");
		monthMap.put("aug", "08");
		monthMap.put("sep", "09");
		monthMap.put("oct", "10");
		monthMap.put("nov", "11");
		monthMap.put("dec", "12");
		
		return monthMap;
	}

}
