import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;


// Cory Parker Section 5 - check for file , command args ,  each line same # of char, -  only ones n 0s, print
public class OnesZerosB {
	
	
	public static void main(String[] args){
		int i=0;
		FileReader fread = null, fread2 =null;
		Scanner s = null, s2 = null;
		String charLineLength = null;
		
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
			charLineLength = s.nextLine();			
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
			if (tempData.length() != charLineLength.length()) {
				System.out.println("Length Mismatch");
				System.exit(1);
			}
			while(time<charLineLength.length()) {//should mean that the char at goes for the length of nums the row then next line
				char ch = tempData.charAt(i);//array pos
				if (ch != '0' && ch != '1') {//not number check
					 System.out.println("Not a number found");
					    System.exit(1);
				}
				int tempDataI =Integer.parseInt(String.valueOf(ch));
				numArray.add(tempDataI);
				i++;
				time++;
			}
			dataFromFile.add(numArray);	
		}
		s2.close();
				
		for (int z = 0; z < dataFromFile.size(); z++) {
			System.out.println(dataFromFile.get(z).toString().replace("[", "").replace("]", "").replace(",","").replace(" ",""));
			
		}
		
	}

}
