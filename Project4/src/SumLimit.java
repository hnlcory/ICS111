// Cory Parker Section 5
import javax.swing.JOptionPane;
public class SumLimit {
	
	public static void main(String[] args) {
		String valImpS = JOptionPane.showInputDialog("Enter the maximum value:");
		Integer valImp = Integer.parseInt(valImpS);//String to Int
		int sum = 0, runCount =0, x =1;//placeholder integers

	        for(int i = 1; i <= valImp; ++i)//for loop runs a max times of user value
	        {
	            sum += i;//sum = sum + 1
	            runCount = runCount+1;//tracks amount of times for loop is run
	            
	            if (sum > valImp) {//if the count of 1+2+3+4... is greater then the user value, basically undo last for loop run
	            	sum -=i;//undo last sub addition
	            	runCount = runCount-1;  //undo last run count
	            	break;
	            }
	        }
	        for (int i = 0; i < runCount; i++) {//loop to run the correct amount of runCounts
	            System.out.print(x);//x int used to properly print out 1 2 3... 
	            x=x+1;
	            if(i!=runCount-1){//reduce + so no extra 
	                System.out.print("+");
	              }
	        }
	        System.out.print(" is "+sum+" <= "+valImp);//final print out
	}
}

