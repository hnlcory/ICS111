// Cory Parker Lab 5
import javax.swing.JOptionPane;
public class Alphabatize {

	public static void main(String[] args) {
		String First = JOptionPane.showInputDialog(null, "Enter String 1");
		String Second = JOptionPane.showInputDialog(null, "Enter String 2");
		String Third = JOptionPane.showInputDialog(null, "Enter String 3");
		
		if (First.compareTo(Second) < 0 && First.compareTo(Third) <0) {
			if (Second.compareTo(Third) <0) {
				System.out.println("You entered: "+First+" " +Second+" " +Third);
			}
			else {
				System.out.println("You entered: "+First+" " +Third+" " +Second);
			}
			
			
		}
		if (Second.compareTo(First) < 0 && Second.compareTo(Third) <0) {
			if (First.compareTo(Third) <0) {
				System.out.println("You entered: "+Second+" " +First+" " +Third);
			}
			else {
				System.out.println("You entered: "+Second+" " +Third+" " +First);
			}
			
		}
		if (Third.compareTo(First) < 0 && Third.compareTo(Second) <0) {
			if (First.compareTo(Second) <0) {
				System.out.println("You entered: "+Third+" " +First+" " +Second);
			}
			else {
				System.out.println("You entered: "+Third+" " +Second+" " +First);
			}
			
		}
		
	}

}
