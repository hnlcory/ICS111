// Cory Parker Lab 5 
//NOTE: I dont know if the degrees symbol will show up
import javax.swing.JOptionPane;
public class WaterState {

	public static void main(String[] args) {
		String tempFStr = JOptionPane.showInputDialog("Enter Temperature �F:");
		long tempF = Long.parseLong(tempFStr);//convert temp f to long
		String tempType = JOptionPane.showInputDialog("Convert to Celcius (C) or Fahrenheit (F)");
		
		if (tempType.equals ("F") || tempType.equals("f")) {
			if (tempF >= 212) {
				System.out.println("temperature: "+ tempF+"�F steam");
			}
			else if (tempF >=33 && tempF <=211) {
				System.out.println("temperature: "+ tempF+"�F water");
			}
			else {
				System.out.println("temperature: "+ tempF+"�F ice");
			}
		}
		else {
			long tempC = Math.round((tempF - 32) * 5.0 / 9.0);
			if (tempC >= 100) {
				System.out.println("temperature: "+ tempC+"�C steam");
			}
			else if (tempC >= 1 && tempC <=99) {
				System.out.println("temperature: "+ tempC+"�C water");
			}
			else {
				System.out.println("temperature: "+ tempC+"�C ice");
			}
		}
	}
}

