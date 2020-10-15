//Cory Parker Section 5
import java.util.Scanner;

public class PrintHex {
	
	public static void DecimalToHexa() {
		 char[] hexV= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};//hex values
		 
		 System.out.println("enter a number: ");
		 Scanner numImp = new Scanner(System.in);
		 int num = numImp.nextInt();
		 int rem=0;
		 String hexOut=" ";
		 
		   
		 if(num <0) {//if -1 or > then stop
			 numImp.close();
			 return;
		 }
		 
		 while (num>0) {//makes sure to get all remainders
			 rem = num % 16;//modulus for number of hex values to get reminder
			 hexOut = hexV[rem] + hexOut;//output is equal to the array spot 
			 num = num / 16;//divide to continue
			 
		 }
		 
		 System.out.println(hexOut);
		 DecimalToHexa();//recursive 
	}
	
	public static void main(String[] args) {
		DecimalToHexa();
   
  }
}