import java.util.Scanner;
import java.net.*;
import java.io.*;

// Cory Parker Section 5 - check for file , command args ,  each line same # of char, -  only ones n 0s, print
public class OnesZerosC {
	
	
	public static void main(String[] args){
		int argcount=0;
		
		if(args.length==0) {
			System.out.println("No args present");//check for args
			 System.exit(1);
		}
		while(argcount <args.length) {
		
			int i=0, lineCount =0, chars =0; 
			URL url=null, url2=null;
			Scanner s = null, s2 = null;
			
		try {
		url = new URL(args[argcount]);
		url2 = new URL(args[argcount]);
		s = new Scanner(url.openStream());
		}
		catch(IOException e){
			System.out.println("File Not Found");//check for file
			 System.exit(1);	
		}
	
		while (s.hasNext()) {
			lineCount++;//line count for later
			s.nextLine();	
		}
		
		try {
		s2= new Scanner(url2.openStream());
		}
		catch(IOException e){
			System.out.println("File Not Found");//check for file
			 System.exit(1);	
		}
		
		
		String[] array = new String[lineCount];//array creation
		while (s2.hasNext()) {	
			array[i]=s2.nextLine();
			i++;
		}
		chars = array[1].length();//character length 
		for (int j = 0; j < lineCount; j++) {//line length check
			if(array[j].length() != chars) {
				System.out.println("Length mismatch");
				System.exit(1);
			}
			else if(!array[j].matches("[10]*")) {
			    System.out.println("Not a number found");
			    System.exit(1);
			}	
		}				
		for (String element: array) {
            System.out.println(element);
        }		
		argcount++;	
		}
	}
}
