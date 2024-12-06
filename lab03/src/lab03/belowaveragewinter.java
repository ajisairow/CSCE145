//Ronan P.
package lab03;

import java.util.Scanner;

public class belowaveragewinter {

	public static void main(String[] args) {//Creates a scanner
	double[] temp = new double[10];//This creates 10 array values
	Scanner input = new Scanner(System.in);
	
	System.out.println("Welcome to the below average temp program!");
	
	int day = 1;
	for (int i = 0; i < 10; i++)
	{
		System.out.println("Enter temp for day " +day);//User enters the day
		day++;
		temp[i]= input.nextDouble();		
	}
	

	System.out.println("The average temperature is:");
	
	double averageTemp = (temp[0] + temp[1] + temp[2] + temp[3] + temp[4] + temp[5] + temp[6] + temp[7] + temp[8] + temp[9]) / 10;
	System.out.println(averageTemp);//This takes all of the temps and adds it together

    System.out.println("Below average temps were:");

    for (int i = 0; i < 10; i++) {
        if (temp[i] < averageTemp) {//This is an if statement that "sorts" the temp index and grabs all of the values less than the average and separates it.
            System.out.println("Day " + (i + 1) + ": " + temp[i]);}
    }
    input.close(); //Closes the scanner
	}
}
