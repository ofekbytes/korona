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

			// setter constructor
			Data3 data31 = new Data3(
					data3.getData().get("total_cases"),
					data3.getData().get("recovery_cases"),
					data3.getData().get("death_cases"),
					data3.getData().get("last_update"),
					data3.getData().get("currently_infected"),
					data3.getData().get("cases_with_outcome"),
					data3.getData().get("mild_condition_active_cases"),
					data3.getData().get("critical_condition_active_cases"),
					data3.getData().get("recovered_closed_cases"),
					data3.getData().get("death_closed_cases"),
					data3.getData().get("closed_cases_recovered_percentage"),
					data3.getData().get("closed_cases_death_percentage"),
					data3.getData().get("active_cases_mild_percentage"),
					data3.getData().get("active_cases_critical_percentage"),
					data3.getData().get("general_death_rate") );

			// print all Method. 
			data31.printAll();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// class//
