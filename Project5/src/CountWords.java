//Cory Parker Section 5
import java.util.Scanner;
public class CountWords {
	
	public static int countWords(String str) {
		String strT = str.trim();
		int count = strT.split("\\s+").length;
		System.out.println("your string has " +count+" words and "+strT.length()+" characters");
		return count;
	}



	public static void main(String[] args) {
		
		
		Scanner UsrImp = new Scanner(System.in);
		while (true) {
		System.out.print("enter a string: ");
		String str = UsrImp.nextLine();
		//UsrImp.close();
			if (str.equals("done")) {
				UsrImp.close();
				break;
			}
			else {
				countWords(str);
			}
		
		}
		
		
	}

}
