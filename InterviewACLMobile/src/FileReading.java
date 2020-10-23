import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		
		String fileName = "file1.txt";
		
		dataAsString(fileName);
		dataAsByteArray(fileName);
		
	}

	private static void dataAsByteArray(String fileName) {
	}

	private static String dataAsString(String fileName) {
		
		StringBuilder stringData = new StringBuilder();
		try {
			FileInputStream stream = new FileInputStream(fileName);
			while(stream.read()!=-1) {
				int data = stream.read();
				//stringData.append();
			}
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return null;
	}

}

/**
 * 
 * 
 * User
1 Ramesh 11
2 Rakesh 12
3 Suresh 13
4 Harish 11
5 Ankit 13

City
11 Delhi
12 Mumbai
13 Lucknow

Query should print following,

Delhi 2
Mumbai 1
Lucknow 2



select cityName,count(*) from city 
left join user on user.cityId = city.cityId
group by cityName;
 
 * 
 * 
 * 
 * 
 * 
 * 
