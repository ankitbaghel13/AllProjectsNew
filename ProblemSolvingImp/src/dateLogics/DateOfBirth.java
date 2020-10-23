package dateLogics;

/**
 * 
 * @author Ankit
 *
 */
public class DateOfBirth {

	public static void main(String[] args) {

		String dob = "05-10-2008";
		String today = "12-11-2017";
		String age = getAge(dob,today);
		
		System.out.println(over18orNot(dob,today));

		System.out.println(age);
	}

	private static String over18orNot(String dob, String today) {
		
		String[] dobArray = dob.split("-");
		int dobDay = Integer.parseInt(dobArray[0]);
		int dobMonth = Integer.parseInt(dobArray[1]);
		int dobYear = Integer.parseInt(dobArray[2]);

		String[] todayArray = today.split("-");
		int todayDay = Integer.parseInt(todayArray[0]);
		int todayMonth = Integer.parseInt(todayArray[1]);
		int todayYear = Integer.parseInt(todayArray[2]);

		int ageDays = todayDay-dobDay;
		int ageMonths = todayMonth-dobMonth;
		int ageYears = todayYear-dobYear;

		if(dobDay>31 || todayDay>31 || dobMonth>12 || todayMonth>12)
			return "Invalid date";
		
		if(ageYears<0 || (ageYears == 0 && ageMonths<0) || (ageYears == 0 && ageMonths == 0 && ageDays<0))
			return "Invalid date of birth.Please enter valid date of birth";
		
		if(ageYears>18 || (ageYears==18 && ageMonths>0) || (ageYears==18 && ageMonths==0 && ageDays>=0))
			return "Valid";
		else
			return "Invalid";
		
	}

	public static String getAge(String dob,String today){
		
		int daysInMonthArray[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		String[] dobArray = dob.split("-");
		int dobDay = Integer.parseInt(dobArray[0]);
		int dobMonth = Integer.parseInt(dobArray[1]);
		int dobYear = Integer.parseInt(dobArray[2]);

		String[] todayArray = today.split("-");
		int todayDay = Integer.parseInt(todayArray[0]);
		int todayMonth = Integer.parseInt(todayArray[1]);
		int todayYear = Integer.parseInt(todayArray[2]);

		int ageDays = todayDay-dobDay;
		int ageMonths = todayMonth-dobMonth;
		int ageYears = todayYear-dobYear;

		if(dobDay>31 || todayDay>31 || dobMonth>12 || todayMonth>12)
			return "Invalid date";
		if(ageYears<0 || (ageYears == 0 && ageMonths<0) || (ageYears == 0 && ageMonths == 0 && ageDays<0))
			return "Invalid date of birth.Please enter valid date of birth";
		if(ageYears==0 && ageMonths==0 && ageDays==0)
			return "Happy Birth Day!!!";

		if(ageMonths<0){
			ageYears = ageYears-1;
			ageMonths = ageMonths+12;
		}

		if(ageDays<0){
			if(ageMonths==0){
				ageYears = ageYears-1;
				ageMonths = ageMonths+11;
			}	
			else 
				ageMonths = ageMonths-1;
			ageDays = ageDays+daysInMonthArray[dobMonth-1];
		}

		return ageYears+" years, "+ageMonths+" month & "+ageDays+" days.";
	}
	
}
