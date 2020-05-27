package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Korona {

	/// constructor ///
	public Korona() { }
	
	public void userInstruction() {
		System.out.println("Task: ");
		System.out.println("Print the 'closed cases recovered percentage'");
		System.out.print("The 'closed cases recovered percentage' is::: ");
	}
	
	public static void main(String[] args) {
		
		Utility utility = new Utility();
		
		Korona korona = new Korona();
		
		///---[Solution1 --> Data1]----///
		// get percentage from json file - no calculation
		korona.userInstruction();
		Solution1 solution1 = new Solution1();

		System.out.println("\n");
		utility.getCurrentTime();
		
		
		///---[Solution2 --> Data2]----///
		// get percentage from json file and calculate the percentage.
		// (min / max) * 100
		korona.userInstruction();
		Solution2 solution2 = new Solution2();
		utility.getCurrentTime();

		System.out.println("\n");
		Solution3 solution3 = new Solution3();
		utility.getCurrentTime();
	}//main//
}//class//
