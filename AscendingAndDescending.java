/*  Page 224 Exercise 2
	Author: Rish
	Date: 08/01/2019
	Filename: AscendingAndDescending.java
*/
import java.util.Scanner;
public class AscendingAndDescending
{
	public static void main(String[] args) {
		// Variables
		int num1;
		int num2;
		int num3;
		int first = 0;
		int second = 0;
		int third = 0;
		Scanner keyboard = new Scanner(System.in);

		// Input
		System.out.println("Enter first number: ");    
		num1 = keyboard.nextInt();

		System.out.println("Enter second number: ");   
		num2 = keyboard.nextInt();

		System.out.println("Enter third number: ");  
		num3 = keyboard.nextInt();

		// Determining which value should be first in descending order. (The highest value)
		// Num1
		if (num1 >= num2 && num1 >= num3)
			first = num1;

		// Num2
		if (num2 >= num1 && num2 >= num3)
			first = num2;

		// Num3
		if (num3 >= num1 && num3 >= num2)
			first = num3;

		// Determining which value should be second in descending order. (The middle value)
		// Num1 Calculations
		if (num1 >= num2 && num1 <= num3)
			second = num1;
		if (num1 <= num2 && num1 >= num3)
			second = num1;

		// Num2 Calculations
		if (num2 >= num1 && num2 <= num3)
			second = num2;
		if (num2 <= num1 && num1 >= num3)
			second = num2;

		// Num3 Calculations
		if (num3 >= num1 && num3 <= num2)
			second = num3;
		if (num3 <= num1 && num3 >= num2)
			second = num3;

		// Determing which value should be third in descending order. (Lowest value)
		// Num1 Calculations
		if (num1 <= num2 && num1 <= num3)
			third = num1;

		// Num2 Calculations
		if (num2 <= num1 && num2 <= num3)
			third = num2;

		// Num3 Calculations
		if (num3 <= num1 && num3 <= num2)
			third = num3;

		// Output
		System.out.println("Descending order: " + first + "," + second + "," + third);
		System.out.println("Ascending order: " + third + "," + second + "," + first);
	}
}