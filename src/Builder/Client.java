package Builder;

public class Client {
	
	public static void main(String[] args) {
		
		HpDesktopBuilder hpDesktopBuilder = new HpDesktopBuilder();
		DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
		
		DesktopDirector director1 = new DesktopDirector(hpDesktopBuilder);
		DesktopDirector director2 = new DesktopDirector(dellDesktopBuilder);
		
		Desktop desktop1 = director1.BuildDesktop();
		Desktop desktop2 = director2.BuildDesktop();
		
		desktop1.showSpecs();
		desktop2.showSpecs();
		
		// return 0; when we change return type to 'int' and return this
					// not able to run the file.(Don't get option to run as java file).
		
	}
}
