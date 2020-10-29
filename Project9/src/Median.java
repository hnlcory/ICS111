import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

//Cory Parker - Section 5
public class Median {

	public static ArrayList<Integer> arrList = new ArrayList<Integer>();
	public static Integer curNum=0;
	
	 private static double computeMedian(ArrayList<Integer> numbers) {
		 int same=0,lower=0,higher=0,count=0;
		 
		 //loop to check for < > or =
		 while (arrList.size()-1>count) {//temp fix to put -1 of arraylist size
			if(arrList.get(curNum) > arrList.get(count)) {//if number being compared is > than arraylist x
				lower++;
			}
			else if (arrList.get(curNum) < arrList.get(count)) {
				higher++;
			}
			else if (arrList.get(curNum) == arrList.get(count)) {
				same++;
			}
			 count++;
		 }
		 
		 if(lower+same>higher && lower<same+higher) { // need even and odd check -possily same-1 since it counts istelf
			 System.out.println("median: "+arrList.get(curNum));
		 }
		 else {
			 curNum++;
			 computeMedian(arrList);
		 }
		
		 
		 //System.out.println(arrList.get(curNum));
		 //System.out.println(lower+" "+higher+" "+same);
		 double temp = 0.0;//temp 
		 return temp;
	 }
		
	 
	 
	public static void main(String[] args) {
		int argcount=0;
		if(args.length==0) {//args check
			System.out.println("no args provided");//check for args
			 System.exit(1);
		}
		while(argcount <args.length) {//for each file
			FileReader fread=null;
			File file = new File(args[argcount]);
			Scanner s = null;
			
			
			try {//file read and open
				fread= new FileReader(file);
				s = new Scanner(fread);
			}
			catch(FileNotFoundException e){
				System.out.println("file not found");
				System.exit(1);
			}
			
			//check for file with anything except , and integers
			
			while (s.hasNext()) {//parse int into arraylist
				String curLine = s.nextLine();
				//System.out.println(curLine);
				String [] values=curLine.split(",");
				for(String value: values) {
					//System.out.println(Integer.parseInt(value));
					arrList.add(Integer.parseInt(value));
				}
				
			}
			
			//add compute median here if its multiple arrays
		
		//read file  args #
		//parse as integers to arraylist #
		//compute the median value - has to use specific algorithm - 1 or more variables to keep track of whether you have already seen one of the two numbers whose average is the mean
		// handle - no file#, no args#, no separating comma integers, any others - print message, go to next file
		
			argcount++;
		}//end of while loop
		System.out.println(arrList);
		computeMedian(arrList);
	}

}
