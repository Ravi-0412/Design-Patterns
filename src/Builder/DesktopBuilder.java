package Builder;

public abstract class DesktopBuilder {
	
	protected Desktop desktop;
	
	public DesktopBuilder() {
		desktop = new Desktop();
	}
	
	public abstract void buildMonitor();
	public abstract void buildKeyboard();
	public abstract void buildMouse();
	public abstract void buildSpeaker();
	public abstract void buildRam();
	public abstract void buildProcessor();
	public abstract void buildMotherBoard();
	
	public Desktop getDesktop() {
		return desktop;
	}

}
