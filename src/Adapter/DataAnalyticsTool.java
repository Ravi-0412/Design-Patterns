package Adapter;

public abstract class DataAnalyticsTool {
	
	String jsonData;
	
	public DataAnalyticsTool(String pJsonData) {
		jsonData = pJsonData;
	}
	
	public DataAnalyticsTool() {
		super();
	}

	public void analyseData() {
		System.out.println("Analysing Data " + "jsonData");
	}
}
