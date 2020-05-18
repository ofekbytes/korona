package korona;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Korona {

	public Korona() {
		// TODO Auto-generated constructor stub
	}

	
	public void printResult(double recovery_cases, double total_cases) {	
		System.out.println ( (recovery_cases / total_cases) * 100 );
	}
	
	
	public void test1() {
		
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("/home/yaron/git-ofekbytes/korona/korona/src/main/java/korona/data.json"));
 
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray korona = (JSONArray) jsonObject.get("Company List");
			
//			Iterator<JSONObject> iterator = korona.iterator();
//			while (iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/****
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//ReadJson rj = new ReadJson();
		
		Korona k = new Korona();
		k.test1();
		
		System.out.println("test");

	}

	
}


