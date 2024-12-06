import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner k = new Scanner(System.in);
			
			System.out.println("Input 2 numbers: ");
			
			System.out.println("What operation (+,-,/,*)?");
			
			String op= k.nextLine();
			
			double val1 = k.nextDouble();
			double val2 = k.nextDouble();
			
			if(op.equals("+")) {
			MethodHolder.addition(val1,  val2);
			double pi = Math.PI;
			
			double output = MethodHolder.addition(val1, val2);
			
			System.out.println(output);
			}
			else if(op.equals("-")) {
				double output = MethodHolder.subtraction(val1, val2);
				
				System.out.println(output);
			} 
			else if(op.equals("*")) { 
				double output = MethodHolder.multiplication(val1, val2);
		
			System.out.println(output);
			}
			
			else if(op.equals("/")) { 
				double output = MethodHolder.division(val1, val2);
				
				System.out.println(output);
			}
			else
			{
				
			System.out.println("NaN"); // Not a number
			}
}}