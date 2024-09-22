/* 13 - Ryan Izac Eudrik B. Gonda - 11 PROG 1 

 * 
Act 5- While loop - Nov.25.2022

Problem : Write an program that prompts the user to input an integer between 
0 and 35. If the user enters a number that is less than or equal to 9, the program should be finished;
Otherwise, it should output A for 10 , B for 11, C for 12.., and Z for 35.
(In a while loop form).


*/
import java.util.Scanner;
public class activity_5_13gonda {

	public static void main(String[] args) {
		int integer, ctr=1;
		int num;
		Scanner input = new Scanner(System.in);
	   
	    System.out.println("How many times do you want to repeat the input?");
	    num = input.nextInt();
		
		while (ctr <= num) {
			System.out.println("Input an integer between 0 - 35: ");
			integer = input.nextInt();  //to input the next integer
			
			if (integer <=9) {
				System.out.println("The integer you had entered is "+ integer +" "
			    + "and the result is "+(char)(integer + 55)); /* to display the A,B,C... to Z when the user inputs 9 to 35, 
			    i assigned char / an 55 because it's an ascii value for a char. */
			
				
				
				
			} else {
				System.out.println(integer);
			}
			ctr++;
				
				
			}	
		System.out.println("end of code");
		}

	

	}


