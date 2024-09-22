 
/*Act 3.3 
 * 
 
 Some Info :
 - This Java code defines a class named Keyboard that has several instance variables
 such as <Keycap>, <Switches>, <Keys>, <mountingPlate>, <Length>, <Width>, and <Price>.

 - viewAttributes() method prints the values of the instance variables to the console 
and writes them to a file named anotherMechanicalKeyboard.txt.

- The anotherAttributes() method prompts the user to enter values for the instance variables
 and writes them to a file named MXKeyboard.txt. 
 
 - and i also used file_manipulation. (from previous act3_2 :)
 
*/
import java.util.Scanner;
import java.io.*;

public class Keyboard  {
	String Keycap;
	String Switches;
	int Keys;
	String mountingPlate;
	double Length;
	double Width;
	int  Price;
	
	void viewAttributes() throws IOException{
		PrintWriter outFile = new PrintWriter("anotherMechanicalKeyboard.txt");
		System.out.println("Color:\t\t"+ Keycap);
		outFile.println("Color:\t\t"+ Keycap);
		
		System.out.println("Variant:\t\t"+ Switches);
		outFile.println("Variant:\t\t"+ Switches);
		
		System.out.println("Number of keys:\t"+ Keys);
		outFile.println("Number of keys:\t"+ Keys);
		
		System.out.println("Plate Type:\t"+ mountingPlate);
		outFile.println("Plate Type:\t"+ mountingPlate);
		
		System.out.println("Length:\t\t"+ Length);
		outFile.println("Length:\t\t"+ Length);
		
		System.out.println("Width:\t\t"+ Width);
		outFile.println("Width:\t\t"+ Width);
		
		System.out.println("Base Price:\t\t"+ Price);
		outFile.println("Base Price:\t\t"+ Price);
		
		outFile.print("+---+---+---+---+---+---+---+---+---+---+---+---+---+");
		outFile.print("| q | w | e | r | t | y | u | i | o | p | [ | ] | |");
		outFile.print("+---+---+---+---+---+---+---+---+---+---+---+---+---+");
		outFile.print("| a | s | d | f | g | h | j | k | l | ; | ' |ENTER|"); 
		outFile.print("+---+---+---+---+---+---+---+---+---+---+---+-----+");
		outFile.print("| z | x | c | v | b | n | m | , | . | / |SHIFT|");  
		outFile.print("+---+---+---+---+---+---+---+---+---+---+------+");
		outFile.print("-code by Izac Gonda ^^");				
		outFile.close();
	}
	
	
	void anotherAttributes() throws IOException{
		PrintWriter anotherFile = new PrintWriter("MXKeyboard.txt");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Color:\t\t");
		Keycap = input.next();
		anotherFile.println("Color:\t\t"+ Keycap);
		
		System.out.print("Variant:\t\t");
		Switches = input.next();
		anotherFile.println("Variant:\t\t"+ Switches);
		
		System.out.print("Number of keys:\t\t");
		Keys = input.nextInt();
		anotherFile.println("Number of keys:\t\t"+ Keys);
		
		System.out.print("Type of Plate:\t");
		mountingPlate = input.next();
		anotherFile.println("Type of Plate:\t"+ mountingPlate);
		
		System.out.print("Length:\t\t");
		Length = input.nextDouble();
		anotherFile.println("Length:\t\t"+ Length);
		
		
		System.out.print("Width:\t\t");
		Width = input.nextDouble();
		anotherFile.println("Width:\t\t"+ Width);
		
		System.out.print("Base Price:\t\t");
		Price = input.nextInt();
		anotherFile.println("Base Price:\t\t"+ Price);
		
		
		
		anotherFile.print("+---+---+---+---+---+---+---+---+---+---+---+---+---+");
		anotherFile.print("| q | w | e | r | t | y | u | i | o | p | [ | ] | |");
		anotherFile.print("+---+---+---+---+---+---+---+---+---+---+---+---+---+");
		anotherFile.print("| a | s | d | f | g | h | j | k | l | ; | ' |ENTER|"); 
		anotherFile.print("+---+---+---+---+---+---+---+---+---+---+---+-----+");
		anotherFile.print("| z | x | c | v | b | n | m | , | . | / |SHIFT|");  
		anotherFile.print("+---+---+---+---+---+---+---+---+---+---+------+");
		anotherFile.print("^^");
				
				
	
		anotherFile.close();
	}
}
