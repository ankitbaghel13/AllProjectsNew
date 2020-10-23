package InterviewAltimetrikPaypal;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.net.URL;
import java.io.*;
import javax.net.ssl.HttpsURLConnection;

public class RESTClient {

	public static void main(String[] args) {
		try{
	        //Rest api call
	        String httpsURL = "https://jsonmock.hackerrank.com/api/articles?author=epaga&page=1";
	        URL myUrl = new URL(httpsURL);
	        HttpsURLConnection conn = (HttpsURLConnection)myUrl.openConnection();
	        InputStream is = conn.getInputStream();
	        InputStreamReader isr = new InputStreamReader(is);
	        BufferedReader br = new BufferedReader(isr);

	        String inputLine;

	        while ((inputLine = br.readLine()) != null) {
	            System.out.println(inputLine);
	        }

	        br.close();
	        
	        JsonElement jelement = new JsonParser().parse(jsonLine);
	        JsonObject  jobject = jelement.getAsJsonObject();
	        jobject = jobject.getAsJsonObject("data");
	        JsonArray jarray = jobject.getAsJsonArray("translations");
	        jobject = jarray.get(0).getAsJsonObject();
	        String result = jobject.get("translatedText").getAsString();

	        //String[] titles;
	        
	        }
	        catch(Exception e){
	            System.out.println("exception");
	        }
	}

}
