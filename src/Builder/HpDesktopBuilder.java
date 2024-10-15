package Builder;

public class HpDesktopBuilder extends DesktopBuilder{

	@Override
	public void buildMonitor() {
		desktop.setMonitor("HP Monitor");
		
	}

	@Override
	public void buildKeyboard() {
		desktop.setKeyboard("HP Keyboard");
		
	}

	@Override
	public void buildMouse() {
		desktop.setMouse("HP Mouse");
		
	}

	@Override
	public void buildSpeaker() {
		desktop.setSpeaker("HP Speakar");
		
	}

	@Override
	public void buildRam() {
		desktop.setRam("HP Ram");
		
	}

	@Override
	public void buildProcessor() {
		desktop.setProcessor("HP Processor");
		
	}

	@Override
	public void buildMotherBoard() {
		desktop.setMotherboard("HP MotherBoard");
		
	}

}