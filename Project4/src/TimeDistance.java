// Cory Parker Section 5
import javax.swing.JOptionPane;

public class TimeDistance {
	
	enum Tranp {Car,Foot,Bicycle,Scooter,Skateboard} //enum for transport
	
	public static void main(String[] args) {
		String disInpS = JOptionPane.showInputDialog("Enter the distance:");
		String tranInpS = JOptionPane.showInputDialog("Enter 1 for driving, 2 for walking, 3 for bicycle, 4 for scooter, 5 for skateboard");
		Integer tranInp = Integer.parseInt(tranInpS); //change transportation choice to int
		Double disInp = Double.parseDouble(disInpS); // distance to double in case of decimal
		Integer Speed = 0;
		Double AnswerH = 0.0;// placeholder numbers for speed and the final hour/min
		Double AnswerM = 0.0;
		
		Tranp type=Tranp.valueOf("Car");
		
		switch(tranInp){
		case 1:
			type=Tranp.Car;
			break;
		case 2:
			type=Tranp.Foot;
			break;
		case 3:
			type=Tranp.Bicycle;
			break;
		case 4:
			type=Tranp.Scooter;
			break;
		case 5:
			type=Tranp.Skateboard;
			break;
		}
		switch(type) {
		case Car:
			Speed = 30;
			AnswerM = ((disInp / Speed)*60) %60; //now in minutes, remove hours to get remainder
			AnswerH = (disInp / Speed)-((disInp / Speed)%1);//rounds number for hours so math to round down since min seperate
			break;
		case Foot:
			Speed = 3;
			AnswerM = ((disInp / Speed)*60) %60;
			AnswerH = (disInp / Speed)-((disInp / Speed)%1);
			break;
		case Bicycle:
			Speed = 10;
			AnswerM = ((disInp / Speed)*60) %60;
			AnswerH = (disInp / Speed)-((disInp / Speed)%1);
			break;
		case Scooter:		
			Speed = 20;
			AnswerM = ((disInp / Speed)*60) %60;
			AnswerH = (disInp / Speed)-((disInp / Speed)%1);
			break;
		case Skateboard:
			Speed = 5;
			AnswerM = ((disInp / Speed)*60) %60;
			AnswerH = (disInp / Speed)-((disInp / Speed)%1);
			break;
		}
		if (AnswerM <=9 && AnswerM >=1) {// probably a not so efficient way to seperate and change outputs such as "11:1" to "11:01" but it works and I couldn't figure out something else. its been 6 hours send help
			String output= String.format("It takes %.0f:0%.0f to go "+disInp+" miles at "+Speed+" mph", AnswerH, AnswerM);
			System.out.println(output);
		}
		else if (AnswerM == 0){
			String output= String.format("It takes %.0f:00 to go "+disInp+" miles at "+Speed+" mph", AnswerH, AnswerM);
			System.out.println(output);
		}
		else {
			String output= String.format("It takes %.0f:%.0f to go "+disInp+" miles at "+Speed+" mph", AnswerH, AnswerM);
			System.out.println(output);
		}
	}
}
