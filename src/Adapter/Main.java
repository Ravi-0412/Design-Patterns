package Adapter;

public class Main {
	
	public static void main(String[] args) {
		
		XMLData xmlData = new XMLData("Sample XML Data");
		DataAnalyticsTool tool = new Adapter(xmlData); // client should not bother and use only the analystical tool so making object of 'Adapter'.
		// client will be only calling the analytic tool but internally adpater will be processing to json and doing the analysis by calling analyse function of adapter class.
		Client client = new Client();
		client.ProcessData(tool); // analyse data of Adapter class will be called
	}

}


