//Ronan Param
import java.util.Scanner;

public class CalculatorMethods {


	//Shortens System.out.println(); to println();
	public static void println(String str) {
		System.out.println(str);
	}
	
public static int getInt(String prompt) {
	Scanner input = new Scanner(System.in);
	println(prompt);
	int num = input.nextInt();
	input.close();
	return num;
}

private static double sum(double a, double b) {
	return a + b;
}

private static double sub(double a, double b) {
	return a - b;
}

private static double mult(double a, double b) {
	return a * b;
}

private static double div(double a, double b) {
	if (b != 0) {
		return a / b;
	} else {
		println("Error: Dividing by zero is undefined");
		return Double.NaN;
	}
}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean runProgram = true;
	String operations = " ";
	int choice = 0;// Operation choice
	double a = 0;// First value
	double b = 0;// Second value
	double c = 0;// Resulting value

	do {
		println("Enter 2 numbers: ");
		a = input.nextDouble();
		b = input.nextDouble();
		// This is the choices of math operations
		println("What operation do you want to use on your numbers?");
		println("1.) Addition");
		println("2.) Subtraction");
		println("3.) Multiplication");
		println("4.) Division");
		choice = input.nextInt();

		if (choice > 4 || choice < 1) {
			println("Invalid choice");
			runProgram = false;
		}

		else {

			c = operations(choice, operations, a, b);

			println(a + " + " + b + "=" + c);

			println("Would you like to do this again?");
			input.nextLine();
			String again = input.nextLine();

			if (!again.equalsIgnoreCase("Yes")) {
				runProgram = false;
			}
		}

	} while (runProgram == true);
	println("Thank you for using this program!");
	input.close();

} // This displays user operation

public static void select(String operation) {
	println("You selected " + operation + ".");
}

public static double operations(int choice, String operation, double a, double b) {
	double c = 0;
	// Addition
	if (choice == 1) {
		operation = "Addition";
		select(operation);
		c = sum(a, b);
	}
	// Subtraction
	else if (choice == 2) {
		operation = "Subtraction";
		select(operation);
		c = sub(a, b);
	}
	// Multiplication
	else if (choice == 3) {
		operation = "Multiplication";
		c = mult(a, b);
	}
	// Division
	else if (choice == 4) {
		operation = "Division";
		c = div(a, b);
	}
	return c;
}
}
