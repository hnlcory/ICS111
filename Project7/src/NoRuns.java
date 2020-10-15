//Cory Parker Section 5
import java.util.ArrayList;
import java.util.Arrays;


public class NoRuns {

	public static void main(String[] args) {
		String[] array1=args;
		int count=0;
		System.out.println(Arrays.toString(array1));
		
		
		
		
		
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(array1));
		
		System.out.println(list);
	    
		while(count<3) {
		
			for(int i=0;i<list.size()-1;i++) {
				if (list.get(i).equals(list.get(i+1))) {
					list.remove(i);
					System.out.println(list);
				}
			}
			count++;
		}
		
		String formattedString = list.toString().replace("]", " ").replace("[", " ");
		
		int size = list.size();
		System.out.print("the array now contains the "+size+" element(s):"+formattedString);
		
		
		
		 

	}

}
