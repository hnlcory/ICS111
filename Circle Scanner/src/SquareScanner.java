// Cory Parker, Section 5
import java.util.Scanner;
import java.lang.Math;
public class SquareScanner {

	public static void main(String[] args) {
		Scanner Length = new Scanner(System.in);
		
		System.out.print("side of square:"); // text to ask for radius
		
		String lengthString = Length.nextLine(); // read the user input as string
		
		Double lengthDouble = Double.parseDouble(lengthString); // convert to double for decimal
		
		Length.close(); // stop resource leak
		
		var Answer = Math.sqrt(2) * lengthDouble; // maths
		
		System.out.printf("a square with side %.4f has a diagonal of length %.4f", lengthDouble, Answer); // answer
		
	}

}
