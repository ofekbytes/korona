package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

public class Solution2 {
	public Solution2() {
		String stFileName = "/home/yaron/git-ofekbytes/korona/korona/src/main/java/korona/data.json";
		Gson gson = new Gson();
		try (Reader reader = new FileReader(stFileName)) {
			Data2 data2 = gson.fromJson(reader, Data2.class);
			System.out.println("Task: ");
			System.out.println("Print the 'closed cases recovered percentage'");
			System.out.print("The 'closed cases recovered percentage' is::: ");

			System.out.println(data2.getData().get("total_cases"));

			// System.out.print(data1.getData().get("closed_cases_recovered_percentage") + "
			// % ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}// class//
