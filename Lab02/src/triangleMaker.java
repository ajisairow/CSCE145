import java.util.Scanner;

public class triangleMaker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to triangle maker! Enter the size of the triangle: ");
		
		if(scanner.hasNextInt()) {
			int size = scanner.nextInt();
			
			if (size > 0) {
				drawTriangle(size);
			} else {
	            System.out.println("Invalid input.");
			}
			
			}
		scanner.close();
		}
	static void drawTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("DONE!");
	}

}
