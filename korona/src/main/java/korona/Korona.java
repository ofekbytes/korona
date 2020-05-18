package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Korona {

	public double stringToDouble(String value)
	{
		return (Double.parseDouble(value));
	}
	
	public void printResult(String recovery_cases , String stTotalCases) {
		
		System.out.print("Percentage of recovery_cases are ");
		//System.out.print( (stringToDouble(stTotalCases) / stringToDouble(recovery_cases) * 100) );
		System.out.print(stringToDouble(recovery_cases));

	}
	
	public static void main(String[] args) {
		
		String stFileName = "";
		
		Gson gson = new Gson();
		Korona korona = new Korona();
		
		
		
		try (Reader reader = new FileReader("/home/yaron/git-ofekbytes/korona/korona/src/main/java/korona/data.json")) {
			
			Data data = gson.fromJson(reader, Data.class);
			
			
			data.setStTotal_cases(data.getData().get("total_cases") );
			data.setStRecovery_cases(data.getData().get("recovery_cases"));
			
			korona.printResult (data.getStRecovery_cases() , data.getStTotal_cases() );
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
