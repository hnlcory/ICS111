//Cory Parker Section 5 -
import java.util.Scanner;
public class AllSubstrings {

	public static void printSubstrings(String str) {
		for (int i=0; i < str.length(); i++) {
			System.out.println(str);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner strI = new Scanner(System.in);
		String strImp = strI.nextLine();
		strI.close();
		printSubstrings(strImp);

	}

}