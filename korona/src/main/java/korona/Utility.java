package korona;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class Utility {

	private Date date;
	

	public Utility() {
		getCurrentTime();
	}
	
	public void getCurrentTime() {
		date = new Date(System.currentTimeMillis());
		System.out.println("....." + date);
	}
	


}
