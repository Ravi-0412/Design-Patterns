package AbstractFactory;

public class MacFactory implements Ifactory{

	@Override
	public IButton CreateButton() {
		return new MacButton();
	}

	@Override
	public ITextBox CreateTextBox() {
		return new MacTextBox();
	}

}
