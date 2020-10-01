//Cory Parker Section 5
import java.util.Scanner;
public class CountWords {
	
	public static int countWords(String str) {
		String strT = str.trim();//remove spaces in front and end - add if count contains just blank here?
		int count = strT.split("\\s+").length;//splits string, then length of the spaces in words
		System.out.println("your string has " +count+" words and "+strT.length()+" characters");//string count and length
		return count;
	}

	public static void main(String[] args) {
		Scanner UsrImp = new Scanner(System.in);
		while (true) {//continued loop to be broken eventually
		System.out.print("enter a string: ");
		String str = UsrImp.nextLine();
			if (str.equals("done")) {//check for user entering done
				UsrImp.close();
				break;//break loop
			}
			else {
				countWords(str);
			}		
		}		
	}
}
