package korona;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ReadJson {

//	private double dbTotalCases;
//	private double recoveryCases;

	public ReadJson() {

		Gson gson = new Gson();

		try {
			Object object = gson.fromJson(new FileReader("/home/yaron/workspace-sts/korona/korona/src/data.json"),
					Object.class);

		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
