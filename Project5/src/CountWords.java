//Cory Parker Section 5
//TODO
import java.util.Scanner;
public class CountWords {

	public static int countWords(String str) {
		
		int count = 1;

		 for (int i = 0; i < str.length(); i++) {//runs for number of letters of input
			 
			 if(str.charAt(0)== ' ' && str.length()==1){//control for blank 
				count=0;
				str=" ";
				break;
			 }
			 
			 else if (str.charAt(i) == ' ' && str.charAt(i+1)!=' '){//increase count for words 
	                count++;
			 } 
			 
		 }
		 
		System.out.println("your string has " +count+" words and "+str.length()+" characters");
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
				countWords(str);//call method
			}		
		}		
	}
}
