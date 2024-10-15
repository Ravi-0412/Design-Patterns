package AbstractFactory;

public class WinFactory implements Ifactory{

	@Override
	public IButton CreateButton() {
		return new WinButton();
	}

	@Override
	public ITextBox CreateTextBox() {
		return new WinTextBox();
	}

}
