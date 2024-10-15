package Builder;

public class Desktop {
	
	String monitor;
	String keyboard;
	String mouse;
	String speaker;
	String ram;
	String processor;
	String motherboard;
	
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	
	// to show specification of desktop
	public void showSpecs() {
		System.out.println("-------------------");
		System.out.println("Specification are:");
		System.out.println("Monitor: "+monitor);
		System.out.println("Keyboard: "+keyboard);
		System.out.println("Mouse: "+mouse);
		System.out.println("Speaker: "+speaker);
		System.out.println("Ram: "+ram);
		System.out.println("Processor: "+processor);
		System.out.println("Mother Board: "+motherboard);
		
	}

}
