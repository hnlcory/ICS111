//Cory Parker Lab 5
import javax.swing.JOptionPane;
public class RentalRelief {

	public static void main(String[] args) {
		String houseSizeS = JOptionPane.showInputDialog(null,"Enter Household Size");
		String houseIncomeS = JOptionPane.showInputDialog(null,"Enter Household Income");
		
		int houseSize=Integer.parseInt(houseSizeS);
		int houseIncome=Integer.parseInt(houseIncomeS);
		
		
		if (houseSize >=11) {//change household size in event of size issue
			houseSize = 10;
		}
		else if (houseSize <=0) {
			houseSize = 1;
		}
		
		//Honolulu       $88,200  $100,800  $113,400  $125,900  $136,000  $146,100  $156,200  $166,200  $176,300  $186,400
		int[] incB = {88200,100800,113400,125900,136000,146100,156200,166200,176300,186400};
		
		if (houseSize == 1) {
			if (houseIncome <= incB[0]) {
				System.out.println("A 1-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 1-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 2) {
			if (houseIncome <= incB[1]) {
				System.out.println("A 2-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 2-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 3) {
			if (houseIncome <= incB[2]) {
				System.out.println("A 3-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 3-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 4) {
			if (houseIncome <= incB[3]) {
				System.out.println("A 4-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 4-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 5) {
			if (houseIncome <= incB[4]) {
				System.out.println("A 5-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 1-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 6) {
			if (houseIncome <= incB[5]) {
				System.out.println("A 6-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 6-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 7) {
			if (houseIncome <= incB[6]) {
				System.out.println("A 7-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 7-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 8) {
			if (houseIncome <= incB[7]) {
				System.out.println("A 8-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 8-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 9) {
			if (houseIncome <= incB[8]) {
				System.out.println("A 9-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 9-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
		else if (houseSize == 10) {
			if (houseIncome <= incB[9]) {
				System.out.println("A 10-person household with income of $"+houseIncome+" is eligible for rental relief");
			}
			else {
				System.out.println("A 10-person household with income of $"+houseIncome+" is NOT eligible for rental relief");
			}
		}
	}

}
