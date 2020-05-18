package korona;

import java.util.List;
import java.util.Map;

public class Data {

	private Map <String, String> data;
	
	private String stTotal_cases;
	private String stRecovery_cases;

	// "data" - 
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
	
	// "data" - inner field
	public String getStTotal_cases() {
		return stTotal_cases;
	}
	public void setStTotal_cases(String stTotal_cases) {
		this.stTotal_cases = stTotal_cases;
	}
	public String getStRecovery_cases() {
		return stRecovery_cases;
	}
	public void setStRecovery_cases(String stRecovery_cases) {
		this.stRecovery_cases = stRecovery_cases;
	}

	
	
	

}
