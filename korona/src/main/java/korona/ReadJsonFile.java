package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadJsonFile {

	public ReadJsonFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		JsonParser jsonParser = new JsonParser();
		
		try {
			Object obj = jsonParser.parse(new FileReader("data.json"));
//			JSONObject jsonObject = (JsonObject) obj;
			
//			String stTotalCases = (String) jsonObject.get("total_cases");
//			System.out.print(dbTotalCases);
			
		} 
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		catch (IOException e) { e.printStackTrace(); } 
//		catch (ParseException e) { e.printStackTrace(); } 
		catch (Exception e) { e.printStackTrace(); }
	}

}
