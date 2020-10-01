//Cory Parker Section 5
//TODO -check for 0 balance, format
import java.util.Scanner;
import java.text.DecimalFormat;

public class Repayment {
	
	
	
	public static double newBalance(double oldBalance, double totalPayments, double interestRate) {
		
		int count=0;
		
		while(true) {
	
			if(oldBalance <= 0 || count == 10) {
				break;
			}
			count= count+1;
			oldBalance = oldBalance - (totalPayments*12);
			double intPYear = 1+(1*(interestRate/100));
			oldBalance = oldBalance*intPYear;

			if (oldBalance <= 0) {
				System.out.println(count+"  0.00");
				break;
			}
			
			DecimalFormat df = new DecimalFormat("#.00");
			String formatted = df.format(oldBalance); 
			
			 
			System.out.println(count+" "+formatted);
			
			
		}
		 //System.out.println(oldBalance);
		 return oldBalance;
		
	}

	public static void main(String[] args) {
		Scanner tAmnt = new Scanner(System.in);
		Scanner mPay = new Scanner(System.in);
		Scanner intR = new Scanner(System.in);
		System.out.println("Total Ammount: ");
		Double oldBalance = tAmnt.nextDouble();
		System.out.println("Monthly Repayment: ");
		Double totalPayments = mPay.nextDouble();
		System.out.println("Interest Rate: ");
		Double interestRate = intR.nextDouble();
		tAmnt.close();
		mPay.close();
		intR.close();
		newBalance(oldBalance,totalPayments,interestRate);
		


	}

}
