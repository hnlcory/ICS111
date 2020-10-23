import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// Cory Parker Section 5 - check for file , command args ,  each line same # of char, -  only ones n 0s, print
public class OnesZerosB {
	
	
	public static void main(String[] args){
		int i=0, lineCount =0, chars =0;
		FileReader fread = null, fread2 =null;
		Scanner s = null, s2 = null;
		
		File file = new File(args[0]);
		
		if(args.length==0) {
			System.out.println("No args present");//check for args
			 System.exit(1);
		}
		
		
		try {
		fread = new FileReader(file);
		fread2 = new FileReader(file);
		s = new Scanner(fread);
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");//check for file
			 System.exit(1);	
		}
		
		
		
		while (s.hasNext()) {
			lineCount++;//line count for later
			s.nextLine();
			
		}
		s.close();
		
		
		// create new ArrayList<Integers> inside of the dataFromFile so that you can then add integers to ArrayList inside it.
		 java.util.ArrayList<java.util.ArrayList<Integer>> dataFromFile =
				    new java.util.ArrayList<java.util.ArrayList<Integer>>();
		 
		 
		
		 //add data to string , change to int
		 //create list
		 //add data to list
		 //add to dataFromFile
		 
		s2= new Scanner(fread2);
		while (s2.hasNext()) {
			
			ArrayList<Integer> numArray= new ArrayList<Integer>();
			
			int time=0;
			i=0;
			String tempData = s2.nextLine();
			while(time<25) {//should mean that the char at goes for the length of the row then next line
				char ch = tempData.charAt(i);//its going diagonal, each time it gets next line, and counts over 1
				int tempDataI =Integer.parseInt(String.valueOf(ch));
				//System.out.println(ch);
				numArray.add(tempDataI);
				i++;
				time++;
			}
			dataFromFile.add(numArray);
			
			
			
		}
		s2.close();
		//System.out.println(dataFromFile);
		
		for (int z = 0; z < dataFromFile.size(); z++) {//test printing - moves to end at finish
			System.out.println(dataFromFile.get(z).toString().replace("[", "").replace("]", "").replace(",","").replace(" ",""));
			//System.out.println(dataFromFile.get(z));
		}
		
		
	
		chars = dataFromFile.size();//character length 
		System.out.println(chars);
		
		for (int j = 0; j < lineCount; j++) {//line length check
			/**
			if(dataFromFile[j].length() != chars) {
				System.out.println("Length mismatch");
				System.exit(1);
			}
			**/
			
			//works but the array already gets rid of non int numbers so check must be earler on
			if(!dataFromFile.get(j).toString().replace("[", "").replace("]", "").replace(",","").replace(" ","").matches("[10]*")) {
			    System.out.println("Not a number found");
			    System.exit(1);
			}
			
		}
				
		
		
	}

}
