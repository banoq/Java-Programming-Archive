import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/* Some Info :
 
 -This Java program reads data from a file named "read.txt", processes the input data,
   and writes the output to a file named "write_output.txt". The program prompts the user 
   to input an integer between 0 and 35, and then it reads each line of the "read.txt" file to obtain the input data.
   
   
 -If the integer is less than or equal to 9, the program prints the integer to the console.
 So, if the integer is greater than 9, the program prints a message that includes the original 
 integer and its corresponding alphabetical value in base 36. The program also writes the input
 and output data to the "write_output.txt" file.
 
 
 */


public class FileManipulation {

	public static void main(String[] args) throws IOException {
		 Scanner input = new Scanner (System.in);
			
			File myFile = new File("read.txt");
			Scanner inputFile = new Scanner (myFile);
        
			FileWriter fWriter = new FileWriter("write_output.txt");
			PrintWriter  outputFile = new PrintWriter(fWriter);
			
			
			int integer = 0,ctr = 1;
			int num;
			
			
		
		while (inputFile.hasNext()){
			
		     String line;
		     line = inputFile.nextLine();
		     
		     
		     outputFile.println("Input an integer between 0 and 35.");	
		     
		  String token[] = line.split(" ");
		 
		  
		  System.out.println("\nThe integer you picked is:"+ token[0]);
		     
		  int integer1 = Integer.parseInt(token[0]);
		     
		    
		     if(integer1 <= 9){
					System.out.println(integer1);
				}
				else{
					
					System.out.println("The number you entered is "+ integer1 +" "+ "and the result is "+(char)(integer1 + 55));
					
					
				}
		     outputFile.println("integer:"+ token[0]);
		     if(integer1 <= 9){
		    	 outputFile.println(integer1);
				}
				else{
					
					outputFile.println("The number you entered is "+ integer1 +" "+ "and the result of the output is "+(char)(integer1 + 55));
		     
		     
		     
		     
		    	}
	}
		System.out.println("\nThanks for running my File_Manipulation Program! - Act 3_2");
				outputFile.close();
}

}
