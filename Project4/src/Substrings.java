// Cory Parker Section 5 -
import javax.swing.JOptionPane;
public class Substrings {

	public static void main(String[] args) {
		String subInp = JOptionPane.showInputDialog("Enter the substring:");
		String strInp = JOptionPane.showInputDialog("Enter the string:");
			
		if (strInp.contains(subInp)) {
			 System.out.print(subInp + " is found in " + strInp + "at position(s) ");//if sub found in string
				
				for (int i = -1; (i = strInp.indexOf(subInp, i + 1)) != -1; i++) {// for loop to check each index wither it matches strInp and sets it to i
				    System.out.print(i +" ");//print i (position location)
				    }
		}
		else {
			System.out.println(subInp + " is not found in " + strInp);//if not found
		}
	}

}
