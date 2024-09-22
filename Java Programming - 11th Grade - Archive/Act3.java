   

/*Problem: Write a problem that prompts the user to input an integer between 0 and 35. If the number is less than or equal to 9, the program should output the number;
 otherwise, it should output A for 10, B for 11, C for 12 ,..., and z for 35. (Hint: Use the cast operator , (char) (), for numbers >=10. ) */

//11 PROG-1 13 Gonda - 14 Gonzales

//October 17 2022 - First Sem.
import java.util.Scanner;
public class Activity_3 {


	public static void main (String[] args) {
		int number;
		int ctr=1
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 35");

		
		
		
		System.out.println("Input an integer between 0 and 35");
		number = input.nextInt();
		
		if (number<10) {
			System.out.println(number);
		}else
		{
			switch (number){
			case 1:
				System.out.print ("1");
				break;
			case 10:
				System.out.print("A");
				break;
			case 11:
				System.out.print("B");
				break;
			case 12:
				System.out.print("C");
				break;
			case 13:
				System.out.print("D");
				break;
			case 14:
				 System.out.print("E");
				 break;
			case 15:
				System.out.print("F");
				break;
			case 16:
				System.out.print("G");
				break;
			case 17:
				System.out.print("H");
				break;
			case 18:
				System.out.print("I");
				break;
			case 19:
				System.out.print("J");
				break;
			case 20:
				 System.out.print("K");
				 break;
			case 21:
				System.out.print("L");
				break;
			case 22:
				System.out.print("M");
				break;
			case 23:
				System.out.print("N");
				break;
			case 24:
				System.out.print("O");
				break;
			case 25:
				System.out.print("P");
				break;
			case 26:
				 System.out.print("Q");
				 break;
			case 27:
				System.out.print("R");
				break;	
			case 28:
				System.out.print("S");
				break;
			case 29:
				System.out.print("T");
				break;
			case 30:
				System.out.print("U");
				break;
			case 31:
				System.out.print("V");
				break;
			case 32:
				 System.out.print("W");
				 break;
			case 33:
				System.out.print("X");
				break;
			case 34:
				System.out.print("Y");
				break;
			case 35:
				System.out.print("Z");
				break;
				
			}
		}
		
    	
    
    
    	
    }
	
    
	

	
	
	}
	

	   

