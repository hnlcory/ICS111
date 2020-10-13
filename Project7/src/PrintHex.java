//Cory Parker Section 5
import java.util.Scanner;

public class PrintHex {

	public static String intToHex(int n) {
		
	}
	
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		Scanner numI = new Scanner(System.in);
		while (true) {
			int numImp = numI.nextInt();
			if (numImp <= -1) {
				numI.close();
				break;
			}
			else {
				intToHex(numImp);
			}
			
		}

	}

}
