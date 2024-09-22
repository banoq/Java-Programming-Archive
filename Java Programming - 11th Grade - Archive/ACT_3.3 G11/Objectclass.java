

import java.io.*;

public class Objectclass {

	public static void main(String[] args) throws IOException{
		
		Keyboard anotherKeyboard = new Keyboard();
		Keyboard MXKeyboard = new Keyboard();
		
		 anotherKeyboard.Keycap = "Cherry Red";
		anotherKeyboard.Switches = "Blue Tactile Switches";
		anotherKeyboard.Keys = 104;
		anotherKeyboard.mountingPlate = "Backlight RGB Full-Plate";
		anotherKeyboard.Length = 36.21;
		anotherKeyboard.Width = 14.81;
		anotherKeyboard.Price = 17990;
		anotherKeyboard.viewAttributes();
		
		System.out.println("\n\n");
		System.out.print("Input your own keyboard" + " specs here!\n");
		MXKeyboard.anotherAttributes();

	}

}
