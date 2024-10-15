package Adapter;

public class Adapter extends DataAnalyticsTool{
	
	private XMLData xmlData;
	
	public Adapter(XMLData pXMLData) {
		this.xmlData = pXMLData;
	}

	@Override
	public void analyseData() {
		System.out.println("converting XML Data " + xmlData.getXmlData() + " to JSON Data");
		System.out.println("Analysing the converted JSON Data");
	}
}
