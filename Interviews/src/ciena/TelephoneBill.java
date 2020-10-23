package ciena;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TelephoneBill {

	public static void main(String[] args) {

		String input = "00:05:00,234-567-890\n"
					 + "00:05:37,888-999-222\n"
					 + "00:00:37,234-567-890\n"
					 + "00:01:00,234-567-891\n";
		
		System.out.println(input);
		Integer bill = getTelephoneBill(input);
		
		System.out.println("Total bill : "+bill);
		
	}

	private static Integer getTelephoneBill(String input) {
		
		String[] arrayNL = input.split("\n");
		String mobNumber;
		String callDuration;
		Integer mobNo;
		Integer seconds;
		Integer currentBill;
		Map<Integer,Integer> mobNoDurationMap = new HashMap<>();
		Map<Integer,Integer> mobNoBillMap = new HashMap<>();
		Integer highestDuration = 0;
		Integer highestMobNo = 0;
		Integer totalBill = 0;
		for(String record : arrayNL){
			
			callDuration = record.split(",")[0];
			mobNumber = record.split(",")[1];
			
			mobNo = Integer.parseInt(mobNumber.split("-")[0] + mobNumber.split("-")[1] + mobNumber.split("-")[2]);
			seconds = Integer.parseInt(callDuration.split(":")[0])*60*60 + 
					Integer.parseInt(callDuration.split(":")[1])*60 + 
					Integer.parseInt(callDuration.split(":")[2]);
			
			if(seconds<300)
				currentBill = 3*seconds;
			else
				currentBill = 150*((seconds/60)+1);
			
			if(!mobNoBillMap.containsKey(mobNo))
				mobNoBillMap.put(mobNo, currentBill);
			else
				mobNoBillMap.put(mobNo, mobNoBillMap.get(mobNo)+currentBill);
			
			if(!mobNoDurationMap.containsKey(mobNo))
				mobNoDurationMap.put(mobNo, seconds);
			else
				mobNoDurationMap.put(mobNo, mobNoDurationMap.get(mobNo)+seconds);
			
		}
		
		for(Entry<Integer,Integer> entry : mobNoDurationMap.entrySet()){
			if(entry.getValue()>highestDuration || (entry.getValue()==highestDuration &&
					entry.getKey()<highestMobNo))
				highestMobNo = entry.getKey(); highestDuration = entry.getValue();
		}
		
		for(Entry<Integer,Integer> entry : mobNoBillMap.entrySet()){
			totalBill += entry.getValue();
		}
		
		totalBill -= mobNoBillMap.get(highestMobNo);
		
		System.out.println("Duration : "+mobNoDurationMap);
		System.out.println("Bill : "+mobNoBillMap);
		return totalBill;
	}

}
