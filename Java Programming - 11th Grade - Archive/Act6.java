/*Problem : Write an program that prompts the user to input an integer between 
0 and 35. If the user enters a number that is less than or equal to 9, the program should output the same number;
Otherwise, it should output A for 10 , B for 11, C for 12.., and Z for 35.
(In a random while form).*/

//Display The Value Of the Random Number(letter)

/*13 - Ryan Izac Eudrik B. Gonda - 11 PROG 1 
Act 6 - Random While*/


import java.util.Random;
import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random rnd = new Random();

    char ch;
    int x;
    
    boolean continueCode = true;
    
    while (continueCode) {
        int num = rnd.nextInt(35) + 1;
        System.out.print("What is the value of this number " + num + "\n");
        if(num <= 9) {
            System.out.println(num);
        }
        else {
            char expectedLetter = (char)(num - 10 + 'A');
            char inputLetter = input.next().charAt(0);
            if (inputLetter == expectedLetter) {
                System.out.println("You are correct");
            }
            else {
                System.out.println("You are incorrect");
            }
        }
  
             /* Guide for the values given:
				  A - 10  E - 14   I - 18   M - 22   Q - 26  U - 30   Y - 34
				  B - 11  F - 15   J - 19   N - 23   R - 27  V - 31   Z - 35
				  C - 12  G - 16   K - 20   0 - 24   S - 28  W - 32
				  D - 13  H - 17   L - 21   P - 25   T - 29  X - 33             */
				      
				      
				        //What's unique in my Code? (Act6)
        
        /* - the code i wrote is simplified by only using the necessary program, and it has a follow-up where my code itself asks the user if they want it to try again.
   
I've added this option to avoid hassle while the user tends to try my program again.
consider that it's an Random While Program with an extra feature. :D

 (because originally an Random while code only displays the value of the random number. )
 
While i may be wrong, im still underwhelmed that i've got a low score in Activity 6 because of this.

But, i'll get better at this as time passes :D

               -Izac Gonda*/
        System.out.print("Do you want to continue? (Yes/No) ");
        ch = input.next().charAt(0);
        if (ch == 'N' || ch == 'n') {
            continueCode = false;
            System.out.println("Thanks for trying out the code, too~\n");
        }
       
    }
    
}
}