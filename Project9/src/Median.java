import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Cory Parker - Section 5
public class Median {

	
		
	public static void main(String[] args) {
		int argcount=0;
		if(args.length==0) {
			System.out.println("no args provided");//check for args
			 System.exit(1);
		}
		while(argcount <args.length) {
			FileReader fread=null;
			File file = new File(args[argcount]);
			
			
			try {
				fread= new FileReader(file);
			}
			catch(FileNotFoundException e){
				System.out.println("file not found");
				System.exit(1);
			}
			
		
		
		//read file  args
		//parse as integers to arraylist
		//compute the median value - has to use specific algorithm - 1 or more variables to keep track of whether you have already seen one of the two numbers whose average is the mean
		// handle - no file, no separating comma integers, any others - print message, go to next file
		
		
		}
	}

}
