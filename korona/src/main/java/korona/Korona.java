package korona;

public class Korona {

	public Korona() {
		// TODO Auto-generated constructor stub
	}

	
	public void printResult(double recovery_cases, double total_cases) {	
		System.out.println ( (recovery_cases / total_cases) * 100 );
	}
	
	
	public static void main(String[] args) {
		ReadJson rj = new ReadJson();
		

	}

}
