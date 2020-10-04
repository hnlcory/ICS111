//Cory Parker Section 5
//TODO -check for 0 balance, format
import java.util.Scanner;
import java.text.DecimalFormat;

public class Repayment {
		
	public static double newBalance(double oldBalance, double totalPayments, double interestRate) {
		
		int count=0;//count to check for max of 10 year
		
		while(true) {
	
			if(oldBalance <= 0 || count == 10) {
				break;
			}
			count= count+1;//count per year
			oldBalance = oldBalance - (totalPayments*12);//calculating new total after yearly payment
			double intPYear = 1+(1*(interestRate/100));//account for interest rate per year
			oldBalance = oldBalance*intPYear;//final per year balance

			if (oldBalance <= 0) {//if payed off
				System.out.println(count+"  0.00");
				break;
			}
			
			DecimalFormat df = new DecimalFormat("#.00");
			String formatted = df.format(oldBalance); //formatting 
			System.out.println(count+" "+formatted);
			
			
		}
		 return oldBalance;
		
	}

	public static void main(String[] args) {
		Scanner tAmnt = new Scanner(System.in);// scanner, text, and scanner close for amount, monthly payment, and interest rate
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
		newBalance(oldBalance,totalPayments,interestRate);//call method
		


	}

}
