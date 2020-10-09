//Cory Parker Section 5 
import java.util.Scanner;
public class AllSubstrings {

	public static void printSubstrings(String str) {
		int count=1;
		 System.out.print("The substrings of "+str+" are ");
         
	        for (int i = 0; i < str.length(); i++) {
	        	
	            for (int c = i+1; c <= str.length(); c++) {
	                System.out.print("\""+str.substring(i, c));//substring start, end spot
	                count++;
	                if (count==c) {
	                	break;
	                }
	                else {
	                	if (count==c && str.length()==1) {//doesnt seem to reach here - should counteract the last , use string length
	                		System.out.print("\"");
	                		break;
	                	}
	                	else {
	                		System.out.print("\"");
	                		System.out.print(", ");
	                	}
	                }
	            }
	            
	        }
	        System.out.println(" ");
	}
	public static void main(String[] args) {
		Scanner strI = new Scanner(System.in);
		
		while (true) {
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