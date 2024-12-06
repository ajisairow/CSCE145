package binaryconverter;

import java.util.Scanner;

public class BinaryConverter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//This prints out the welcome screen
		
		System.out.println("Welcome to the binary converter! \n");
		
		//This dialogue asks for the first binary decimal
		System.out.print("Enter first binary decimal: ");
		String binary1 = keyboard.nextLine();
		//This string takes the 4 binary digits entered by the user, gets the numeric value (either in zeroes or ones) and multiplies it by the four sets of binary digits (0, 1, 2, 4, 8).
		char a = binary1.charAt(0);
		char b = binary1.charAt(1);
		char c = binary1.charAt(2);
		char d = binary1.charAt(3);
		int binary1Sum = ((Character.getNumericValue(a) * 8) + (Character.getNumericValue(b) * 4) + (Character.getNumericValue(c) * 2) + (Character.getNumericValue(d) * 1));
		//This line prints out the result of the first binary number.
		System.out.println("The decimal num of " + binary1 + " is: " +binary1Sum+ "\n");
		
		System.out.print("Enter second binary decimal: ");
		String binary2 = keyboard.nextLine();
		
		char e = binary2.charAt(0);
		char f = binary2.charAt(1);
		char g = binary2.charAt(2);
		char h = binary2.charAt(3);
		int binary2Sum = ((Character.getNumericValue(e) * 8) + (Character.getNumericValue(f) * 4) + (Character.getNumericValue(g) * 2) + (Character.getNumericValue(h) * 1));
		//This code works the same as the first one except it prints out the second line.
		System.out.println("The decimal num of " +binary1+ " is: " +binary2Sum+ "\n");
		//This adds both converted binary decimals together.
		System.out.println("The sum of  " +binary1+ " and " +binary2+ " is: " +(binary1Sum + binary2Sum));
keyboard.close();
	}
}	

