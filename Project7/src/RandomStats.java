//Cory Parker Section 5
import java.util.Arrays;

public class RandomStats {
	
	static Double[] array1 = new Double[1000];
	
	public static void fillArray(Double[] array) {
		for (int i=0;i<1000;i++) {
			array[i] = Math.random();
		}
		System.out.println(Arrays.toString(array));
		return;
	}

	
	public static void computeArray(Double[] array) {
		Double total = 0.0,min=array[0],max=0.0;
	//total value of all the elements of the array, the mean, the minimum, and the maximum.
		for (double number: array) {
			total = total + number;
			if(number > max) {
				max = number;
			}
			else if(number < min) {
				min = number;
			}
			
		}
		
		System.out.println("Total: "+total);
		System.out.println("Mean: "+total/1000);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		return;
	}

	
	public static void main(String[] args) {
		fillArray(array1);
		computeArray(array1);
	}
	
}
