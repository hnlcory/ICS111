//Cory Parker Section 5
import java.util.Scanner;

public class PrintHex {
	
	public static void DecimalToHexa() {
		 char[] hexV= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		 
		 System.out.println("enter a number: ");
		 Scanner numImp = new Scanner(System.in);
		 int num = numImp.nextInt();
		 int rem=0;
		 String hexOut=" ";
		   
		 if(num <0) {
			 numImp.close();
			 return;
		 }
		 
		 while (num>0) {
			 rem = num % 16;
			 hexOut = hexV[rem] + hexOut;
			 num = num / 16;
		 }
		 System.out.println(hexOut);
		 DecimalToHexa();
	}
	
	public static void main(String[] args) {
		DecimalToHexa();
   
  }
}