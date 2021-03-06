package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.Gson;

public class Solution1 {
	public Solution1() {
		String stFileName = "src/main/java/korona/data.json";
		Gson gson = new Gson();
		try (Reader reader = new FileReader(stFileName)) {
			Data1 data1 = gson.fromJson(reader, Data1.class);
			System.out.print(data1.getData().get("closed_cases_recovered_percentage") + " % ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// Solution1 //
}// class//
