// Cory Parker Section 5
import javax.swing.JOptionPane;
public class Substrings {

	public static void main(String[] args) {
		String subInp = JOptionPane.showInputDialog("Enter the substring:");
		String strInp = JOptionPane.showInputDialog("Enter the string:");
			
		if (strInp.contains(subInp)) {
			 System.out.print(subInp + " is found in " + strInp + "at position(s) ");
				
				for (int i = -1; (i = strInp.indexOf(subInp, i + 1)) != -1; i++) {
				    System.out.print(i +" ");
				    }
		}
		else {
			System.out.println(subInp + " is not found in " + strInp);
		}
	}

}
