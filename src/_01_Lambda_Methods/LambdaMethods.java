package _01_Lambda_Methods;

import javax.swing.JOptionPane;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(s.length()-i-1));
			}
			System.out.println("\n");
		}, JOptionPane.showInputDialog("Input a String to reverse"));
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 1) {
					System.out.print(Character.toString(s.charAt(i)).toLowerCase());
				}
				else {
					System.out.print(Character.toString(s.charAt(i)).toUpperCase());
				}
			}
			System.out.println("\n");
		}, JOptionPane.showInputDialog("Input a String to Cap/Lowercase"));
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
				if (!(i == s.length()-1)) {
					System.out.print(".");
				}
			}
			System.out.println("\n");
		}, JOptionPane.showInputDialog("Input a String to add periods too."));
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if (!(s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i' || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u')) {
					System.out.print(s.charAt(i));
				}
			}
		}, JOptionPane.showInputDialog("Input a String to remove the vowels from."));
	
	}
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
