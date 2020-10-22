import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

// Cory Parker Section 5 - check for file , command args , - each line same # of char, only ones n 0s
public class OnesZerosA {
	
	
	public static void main(String[] args){
		int i=0, lineCount =0, chars =0;
		FileReader fread = null, fread2 =null;
		Scanner s = null, s2 = null;
		
		File file = new File(args[0]);
		
		if(args.length==0) {
			System.out.println("No args present");
			 System.exit(1);
		}
		
		
		try {
		fread = new FileReader(file);
		fread2 = new FileReader(file);
		s = new Scanner(fread);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
			 System.exit(1);	
		}
		
		
		
		while (s.hasNext()) {
			lineCount++;//line count for later
			s.nextLine();
		}
		s.close();
		s2= new Scanner(fread2);
		
		
		String[] array = new String[lineCount];
		System.out.println(Arrays.toString(array));
		while (s2.hasNext()) {
			
			array[i]=s2.nextLine();
			i++;
			
			
		}
		System.out.println(lineCount);
		System.out.println(Arrays.toString(array));
		chars = array[1].length();//character length 
		System.out.println(chars);
		
		for (int j = 0; j < lineCount; j++) {
			if(array[j].length() != chars) {
				System.out.println("Length mismatch");
				System.exit(1);
			}
			
		}
	}

}
