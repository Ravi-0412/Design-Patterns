package AbstractFactory;

public class WinButton implements IButton{
	
	@Override
	public void press() {
		System.out.println("Win Button Pressed !");
	}

}
