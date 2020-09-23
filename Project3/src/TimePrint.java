// Cory Parker Lab 5
import javax.swing.JOptionPane;
public class TimePrint {

	public static void main(String[] args) {
		String MinStr = JOptionPane.showInputDialog(null, "Enter Minutes:"); // enter min
		
		int totalMin=Integer.parseInt(MinStr);  // convert to integer
		
		long hours = totalMin / 60;    //code for hours/min
		long minutes = totalMin % 60;
		
		if (totalMin >= 1440 ||  // out of range check
				totalMin <= 0) {
			String ErrorAnswer= "Number out of range. You entered " +totalMin;
			JOptionPane.showMessageDialog(null,ErrorAnswer);
		}else { //In range specify hr(s) and min(s)
			
			if (hours >= 2 && minutes >=2) {
				System.out.println("You entered "+hours+ " hours " +minutes+ " minutes");
			}

			else if (hours >= 2 && minutes ==1) {
				System.out.println("You entered "+hours+ " hours " +minutes+ " minute");
			}
			
			else if (hours == 1 && minutes ==1) {
				System.out.println("You entered "+hours+ " hour " +minutes+ " minute");
			}
			else if (hours == 1 && minutes >=2) {
				System.out.println("You entered "+hours+ " hour " +minutes+ " minutes");
			}	
			else if (hours == 1 && minutes ==0) {
				System.out.println("You entered "+hours+ " hour");
			}
			else if (hours >= 2 && minutes ==0) {
				System.out.println("You entered "+hours+ " hours");
			}
			else if (hours == 0 && minutes ==1) {
				System.out.println("You entered " +minutes+ " minute");
			}
			else if (hours == 0 && minutes >=2) {
				System.out.println("You entered " +minutes+ " minutes");
			}
			//String Answer= String.format("You entered %f hours and %f minutes",hours,minutes);
			//System.out.println("You entered " +hours+ " hour " +minutes+ " minute");
			//JOptionPane.showMessageDialog(null,Answer);
		}
			
	}

}
