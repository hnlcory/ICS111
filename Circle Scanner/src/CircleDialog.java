//Cory Parker, Section 5
import javax.swing.JOptionPane; //dialog box
public class CircleDialog {

	public static void main(String[] args) {
		
		final double MY_PI = Math.PI; // define what MY_PI is
		
		String userResponse = JOptionPane.showInputDialog(null, "radius:"); // pane to get response
		
		Double doubleVal = Double.parseDouble(userResponse); // convert to double
				
		var Answer = 2 * MY_PI * doubleVal; // math quicks
		
		String output= String.format("a circle with radius %.3f has circumference %.3f", doubleVal, Answer); //answer format
		
		JOptionPane.showMessageDialog(null, output); //answer pane
	}

}
