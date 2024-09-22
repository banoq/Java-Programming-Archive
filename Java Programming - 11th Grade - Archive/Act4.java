import java.util.Scanner;
public class act4revised {

	public static void main(String[] args) {
		System.out.println("Input an integer between 0 and 35");
		
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		if (integer <= 9) {
			System.out.println(integer);
			
		}
		else {
			System.out.println("The number you entered is "+ integer + " "+ "and the result is "+(char)(integer + 55));
		}
	}

}
