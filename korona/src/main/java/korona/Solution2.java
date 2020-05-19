package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

public class Solution2 {
	
	// convert
	public String deleteAllCommas(String value) {
		return (value.replaceAll(",", "") ); 
	}
	
	// print result
	public void calculateRecoveryRercentage(Data2 data2) {
		System.out.println("");
		System.out.print( data2.getRecovery_cases() + " / " + data2.getTotal_cases() + " * 100 = " );
		System.out.print( 
				( 
				( Double.parseDouble(data2.getRecovery_cases()) / 
				( Double.parseDouble(data2.getTotal_cases()) ) 
				) * 100 ) + " % " 
				); 
	}
	
	public Solution2() {
		String stFileName = "src/main/java/korona/data.json";
		Gson gson = new Gson();
		try (Reader reader = new FileReader(stFileName)) {
			Data2 data2 = gson.fromJson(reader, Data2.class);
			
			// setter
			data2.setTotal_cases(deleteAllCommas (data2.getData().get("total_cases") ));
			data2.setRecovery_cases(deleteAllCommas (data2.getData().get("recovery_cases") ));

			// print result - sending a reference type argument
			calculateRecoveryRercentage(data2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// class//
