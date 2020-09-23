// Cory Parker, Section 5
import java.lang.Math;
import javax.swing.JOptionPane; //dialog box
public class SquareDialog {

	public static void main(String[] args) {
		
		String lengthString = JOptionPane.showInputDialog("side of square:"); // pane to get response
		
		Double lengthDouble = Double.parseDouble(lengthString); // convert string to double for decimal
		
		var Answer = Math.sqrt(2) * lengthDouble; // quick maths
		
		String output= String.format("a square with side %.4f has a diagonal of length %.4f", lengthDouble, Answer); //answer format
	
		JOptionPane.showMessageDialog(null,output); //pane for answer
	}
		
}
