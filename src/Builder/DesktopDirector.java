package Builder;

public class DesktopDirector {
	
	private DesktopBuilder desktopBuilder; //member
	
	public DesktopDirector(DesktopBuilder pDesktopBuilder) {
		// builder will be passed and we have to assign member to this builder.
		desktopBuilder = pDesktopBuilder;
	}
	
//	public Desktop getDesktop() {
//		return desktopBuilder.getDesktop();
//	}
	
	// main functioon of direct is to direct the process by which product will be build.
	public Desktop BuildDesktop() {
		// build all parts one by one
		desktopBuilder.buildMonitor();
		desktopBuilder.buildMouse();
		desktopBuilder.buildRam();
		desktopBuilder.buildProcessor();
		desktopBuilder.buildKeyboard();
		desktopBuilder.buildSpeaker();
		desktopBuilder.buildMotherBoard();
		
		// after building return the desktop
		return desktopBuilder.getDesktop();  // can make a separate function and return there also(above function).
	}

}
