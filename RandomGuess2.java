/*  In-class Exercise 
	Filename: RandomGuess2.java
	Author: Rishabh Tiwari
	Date: 07/23/2019
*/
import java.util.Scanner;
public class RandomGuess2
{
	public static void main(String[] args) {

		// Variables
		Scanner input = new Scanner(System.in);
		int ranNum = (1 +(int)(Math.random()*10));
		int userInput;


		// Input
		System.out.println("Enter a number between 1 and 10");
		userInput = input.nextInt();

		// Output
		// Checking if userInput is less than the ranNum
		if(userInput < ranNum)
		{
			System.out.println("You chose the number: " + userInput + "\nThe computer chose: " + ranNum);
			System.out.println("Your guess was too low!");
		} 
		if(userInput > ranNum)
		{
			System.out.println("You chose the number: " + userInput + "\nThe computer chose: " + ranNum);
			System.out.println("Your guess was too high!");
		}
		if(userInput == ranNum)
		{
			System.out.println("You chose the number: " + userInput + "\nThe computer chose: " + ranNum);
			System.out.println("YOU DID IT!!!!");
		}
	}
}