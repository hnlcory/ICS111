//Cory Parker Section 5
//import java.util.Arrays;

public class RandomStats {
	
	static Double[] array1 = new Double[1000];//create array to access
	
	public static void fillArray(Double[] array) {
		for (int i=0;i<1000;i++) {
			array[i] = Math.random();//input random numbers between 0 and 1 in each array slot
		}
		//System.out.println(Arrays.toString(array));
		return;
	}

	
	public static void computeArray(Double[] array) {
		Double total = 0.0,min=array[0],max=0.0;
	
		for (double number: array) {//for every double in array
			total = total + number;
			if(number > max) {//finding new max
				max = number;
			}
			else if(number < min) {//finding new min
				min = number;
			}
			
		}
		
		System.out.println("Total: "+total); //total value of all the elements of the array, the mean, the minimum, and the maximum.
		System.out.println("Mean: "+total/1000);//mean is total divided by array size
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		return;
	}

	
	public static void main(String[] args) {
		fillArray(array1);
		computeArray(array1);
	}
	
}
