package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

public class Solution3 {
	
	
	public Solution3() {
		String stFileName = "src/main/java/korona/data.json";
		Gson gson = new Gson();
		try (Reader reader = new FileReader(stFileName)) {
			Data3 data3 = gson.fromJson(reader, Data3.class);
			
			// setter
			System.out.println(data3.getTotal_cases());
			System.out.println(data3.toString());
//			data2.setTotal_cases(deleteAllCommas (data2.getData().get("total_cases") ));
//			data2.setRecovery_cases(deleteAllCommas (data2.getData().get("recovery_cases") ));

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// class//
