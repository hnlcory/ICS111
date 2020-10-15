//Cory Parker Section 5
import java.util.ArrayList;
import java.util.Arrays;

public class NoRuns {

	public static void main(String[] args) {
		String[] array1=args;//array from args
		int count=0;
		
		ArrayList<String> list= new ArrayList<String>(Arrays.asList(array1));//create array list from array
		
		while(count<list.size()) {//run for size of list
		
			for(int i=0;i<list.size()-1;i++) {//for each duplicate word next to each other remove duplicate
				if (list.get(i).equals(list.get(i+1))) {
					list.remove(i);
					
				}
			}
			count++;
		}
		
		String formattedString = list.toString().replace("]", " ").replace("[", " ");//format output to get rid of the [ and ]
		
		int size = list.size();
		System.out.print("the array now contains the "+size+" element(s):"+formattedString);//final printout
		
	}
}
