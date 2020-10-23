import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

// Cory Parker Section 5 - check for file , command args ,  each line same # of char, -  only ones n 0s, print
public class OnesZerosB {
	
	
	public static void main(String[] args){
		int i=0, lineCount =0, chars =0;
		FileReader fread = null, fread2 =null;
		Scanner s2 = null;
		
		File file = new File(args[0]);
		
		if(args.length==0) {
			System.out.println("No args present");//check for args
			 System.exit(1);
		}
		
		
		try {
		
		fread2 = new FileReader(file);
		
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");//check for file
			 System.exit(1);	
		}
		
		s2= new Scanner(fread2);
		
		
		java.util.ArrayList<java.util.ArrayList<Integer>> dataFromFile =
			    new java.util.ArrayList<java.util.ArrayList<Integer>>();
		
		while (s2.hasNext()) {
			dataFromFile.add(s2.nextInt());
		}
		
		
		
		s2.close();
		System.out.println(lineCount);
		System.out.println(Arrays.toString(array));
		chars = array[1].length();//character length 
		System.out.println(chars);
		
		for (int j = 0; j < lineCount; j++) {//line length check
			if(array[j].length() != chars) {
				System.out.println("Length mismatch");
				System.exit(1);
			}
			else if(!array[j].matches("[10]*")) {
			    System.out.println("Not a number found");
			    System.exit(1);
			}
			else {
				
			}
		}
				
		for (String element: array) {
            System.out.println(element);
        }
		
	}

}
