//Cory Parker Section 5 
import java.util.Scanner;
public class AllSubstrings {

	public static void printSubstrings(String str) {
		 System.out.print("The substrings of "+str+" are ");//print structure
         
	        for (int i = 0; i < str.length(); i++) {// iteration of loop
	        	
	            for (int c = i+1; c <= str.length(); c++) {
	                System.out.print("\""+str.substring(i, c));//substring start, end spot
	                	if (i+1== str.length()) {// if the iteration is the final character print the last "
	                		System.out.print("\"");
	                		break;
	                	}
	                	else {
	                		System.out.print("\"");
	                		System.out.print(", ");// prints the ", for every substring
	                	}    
	            }            
	        }
	        System.out.println(" ");
	}
	public static void main(String[] args) {
		Scanner strI = new Scanner(System.in);
		
		while (true) {//infinate loop to be broken by if statement (done)
			System.out.print("enter a string:");
			String strImp = strI.nextLine();
			if (strImp.equals("done")) {
				strI.close();
				break;
			}
			else {
				printSubstrings(strImp);
			}
		}
			
		
		

	}

}