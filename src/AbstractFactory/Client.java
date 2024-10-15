package AbstractFactory;

import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter OS type: ");
		
		String osType = sc.nextLine();
		
		Ifactory fact = GUIAbstractFactory.createFactory(osType);
		
		IButton button = fact.CreateButton(); // this extra layer is added in abstract factory
		button.press();
		
		ITextBox textBox = fact.CreateTextBox(); // this extra layer is added in abstract factory
		textBox.showText();
		
	}

}
