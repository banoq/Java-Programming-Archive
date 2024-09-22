import java.util.Scanner;
// 13-Gonda 14- Gonzales Activity 2 - 11 PROG 1
// Write a program that prompts the user to enter the minutes(e.g 1 billion), and displays the number
//of years and days for the minutes. For simplicity, assume a year has 365 days.
public class ACTIVITY_2 {

	public static void main(String[] args) {
	
    double minutesInYear = 60 * 24 * 365;
    
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of minutes");
	
	double min = input.nextDouble();
	
	long years = (long) (min / minutesInYear);
	int days = (int) (min / 60 / 24) % 365;
	
	System.out.println((int) min +  " minutes is approximately " + years +  " years and " + days +  " days");
	
	
	
	
	
	
	
	
	
	}    
}
