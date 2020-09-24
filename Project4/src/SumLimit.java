// Cory Parker Section 5
import javax.swing.JOptionPane;
public class SumLimit {
	
	public static void main(String[] args) {
		String valImpS = JOptionPane.showInputDialog("Enter the maximum value:");
		Integer valImp = Integer.parseInt(valImpS);
		int sum = 0, runCount =0, x =1;

	        for(int i = 1; i <= valImp; ++i)
	        {
	            // sum = sum + i;
	            sum += i;
	            //System.out.println(sum);
	            runCount = runCount+1;
	            
	            if (sum > valImp) {
	            	//System.out.println("OVER START CODe");
	            	sum -=i;
	            	runCount = runCount-1;
	            	break;
	            }
	        }

	       //System.out.println("Sum = " + sum);
	       //System.out.println("runcount"+ runCount);
	     
	        
	        for (int i = 0; i < runCount; i++) {
	            System.out.print(x);
	            x=x+1;
	            System.out.print("+");	
	            
        
	        }
	        System.out.print(" is "+sum+" <= "+valImp);
	}
}

