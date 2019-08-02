/*  Page 224 Exercise 3.A
	Author: Rish
	Date: 08/01/2019
	Filename: FitnessTracker.java
*/
public class FitnessTracker
{
	// Variables 
	private String activity;
	private int minutesSpent;
	private String date;

	// Constructor with parameters for data fields
	public FitnessTracker(String act, int mins, String dte)
	{
		activity = act;
		minutesSpent = mins;
		date = dte;
	}

	// Getters
	public int getMinutes(){
		return minutesSpent;
	}
	public String getActivity(){
		return activity;
	}
	public String getDate(){
		return date;
	}

	// Output method
	public void display()
	{
		System.out.println("");
		System.out.println("Your activity was: " + activity + "\nTotal minutes spent: " + minutesSpent + "\nThe date of this activity was: " + date);
		System.out.println("Great job! Keep it up.");
	}
}
