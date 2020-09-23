// Cory Parker, Section 5
import java.util.Scanner;  // Import the Scanner class
public class CircleScanner {

	public static void main(String[] args) {
		final double MY_PI = Math.PI; // define what MY_PI is
		
		Scanner radiusObject = new Scanner(System.in); // Create a Scanner object
		
		System.out.print("radius:"); // text to ask for radius
		
		String radiusString = radiusObject.nextLine(); // read the user input but as string
		
		Double radiusDouble = Double.parseDouble(radiusString); // convert the string to a double for the decimal
		
		radiusObject.close(); // stop resource leak
		
		var Answer = 2 * MY_PI * radiusDouble; // math
		
		System.out.printf("a circle with radius %.3f has circumference %.3f", radiusDouble , Answer); // print answer
	}

}
