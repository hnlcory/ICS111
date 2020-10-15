//Cory Parker Section 5
import java.util.Arrays;

public class NoRuns {

	public static void main(String[] args) {
		String[] array1=args;
		System.out.println(Arrays.toString(array1));
		
		for (int i=0;i<array1.length-1;i++) {
			if (array1[i].equals(array1[i+1])){
				System.out.println("equal");
				array1[i+1]="0";
			}
		}
		System.out.println(Arrays.toString(array1));
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i].equals("0")){
				
				
			}
			
		}
	}

}
