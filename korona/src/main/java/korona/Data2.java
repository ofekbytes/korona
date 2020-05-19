package korona;

import java.util.List;
import java.util.Map;

public class Data2 {

	private Map<String, String> data;

	private String total_cases;
	private String recovery_cases;

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public String getTotal_cases() {
		return total_cases;
	}

	public void setTotal_cases(String total_cases) {
		this.total_cases = total_cases;
	}

	public String getRecovery_cases() {
		return recovery_cases;
	}

	public void setRecovery_cases(String recovery_cases) {
		this.recovery_cases = recovery_cases;
	}
}
