//Cory Parker Section 5
import java.util.Scanner;

public class PrintHex {

	public static String intToHex(int n) {
		String f = Integer.toHexString(n);
		System.out.println(f);
		System.out.println("enter a number: ");
		Scanner A= new Scanner(System.in);
		
		
		if () {
		break;
		}
		else {
		intToHex();	
		}
		return f;
		
	}
	
	public static void main(String[] args) {
		System.out.println("enter a number: ");
		Scanner numI = new Scanner(System.in);
		int numImp = numI.nextInt();
		numI.close();	
		intToHex(numImp);
			
			
		

	}

}
