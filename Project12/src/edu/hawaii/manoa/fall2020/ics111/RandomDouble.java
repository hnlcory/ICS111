//Cory Parker Section 5
package edu.hawaii.manoa.fall2020.ics111;
import java.util.Arrays;

public class RandomDouble implements Comparable<RandomDouble> {
	
	private Double variable;// private instance variable
	
	
	public RandomDouble(){// assigns a random double (from Math.random)
		this.variable = Math.random();
	}
	
	public String toString() {// returns string representation of the random double
		String returnString = this.variable.toString();
		return returnString;
	}
	
	public int compareTo(RandomDouble doubleGiven) {//method as required by the Comparable interface
		if (doubleGiven.variable == this.variable) {
			return 0;
		}
		else if(doubleGiven.variable > this.variable){
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public Double returnDouble() { //returns the random double in type double
		return this.variable;
	}
	
	
	public static void main(String[] args) {
		//creates and fills an array of 10 values of type RandomDouble, then sorts them using Arrays.sort, and finally prints the contents of the sorted array
		RandomDouble[] array = new RandomDouble[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=new RandomDouble();
		}
		Arrays.sort(array);
		System.out.println("Sorted Array:\n");
		System.out.println(Arrays.toString(array).replace("[","").replace("]",""));
	}
}
