import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//Cory Parker Section 5



public class AddressBook {
	
	ArrayList <Contact> allContacts = new ArrayList<Contact>();
	
	private static String fileFormat(Contact c) {
		Contact c3= new Contact(null);
		String out= c3.toString();
		return out;
		
	}
	
	//private static Contact nextContact(Scanner in) {
		//tries to read the next contact from the given scanner.  This method returns null if there is no next contact
		
	//}
	
	
	public static void main(String[] args){
		// file scanner part
		FileReader fread=null;
		Scanner fScan = null;
		
		try {
			File file = new File(args[0]);
			fread= new FileReader(file);
			fScan = new Scanner(fread);
		}
		catch(FileNotFoundException e){
				
		}
		
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("no arguments found");
		}
		
		//main menu parts
		Scanner inputScan = new Scanner(System.in);
		
		AddressBook a1 = new AddressBook();
		Contact c1;
		Contact c2 = new Contact(null);
		while (true) {
		System.out.println("Enter 1 to add a new contact, 2 to print all, 3 to search, 4 to save, 0 to exit: ");
		String usrImp = inputScan.nextLine();
		//inputScan.close();//only 1 system in
		
		if (usrImp.equals("1")) {
			//add new contact

			//Scanner nameScan = new Scanner(System.in);
			
			System.out.println("enter the contact information, or newline if done:");
			
			c1=new Contact(inputScan.nextLine());
			String nameImp = inputScan.nextLine();
			if(nameImp.equals("")) {
				
			}
			else {
				c1.saveName(nameImp);
				while (true) {
					System.out.println("enter the contact information, or newline if done:");
					String infoImp = inputScan.nextLine();
					if(infoImp.equals("")) {
						if (c1.getName().length()>1) {						
							//c1.contactInfoAL 
							a1.allContacts.add(c1);		
						}
						break;
					}
					else {
						c1.addContactInformation(infoImp);
						
						//add to arraylist
					}
					
				}
			}
		
		}
		else if(usrImp.equals("2")) {
		//print all
			System.out.println(a1.allContacts.toString().replace("[", "").replace("]", ""));
			
		}
		
		
		else if(usrImp.equals("3")) {
		//search **needs to check for all contacts, name + info
			System.out.println("enter the string to search for: ");
			try {
				String searchImp = inputScan.nextLine();//user search
				for (int i=0; i< a1.allContacts.size();i++) {
				//if content in a1.allContacts matches user imput	
				}
				if(c2.nameMatches(searchImp.toLowerCase()).compareTo(true) == 0) {// needs to check all contacts
					System.out.println("match");
					System.out.println(c2.toString());
				}
				else {
					System.out.println("no match found");
				}
			}
			catch(NullPointerException e) {
				c2.customException();
			}		
		}
		
		
		else if(usrImp.equals("4")) {
		//create file save
		System.out.println("file name?");
		String fileName= inputScan.nextLine();
		File userFile = new File("file.txt");
		
		try {
			userFile.createNewFile();
		} catch (IOException e) {
			c2.customException();
		}
		try {
			Scanner fReader = new Scanner(userFile);
			PrintWriter wite= new PrintWriter(userFile);
			wite.println(a1.allContacts.toString());
			System.out.println("saved "+fileName);
			fReader.close();
			wite.close();
		} catch (FileNotFoundException e) {
			c2.customException();
		}
		}
		
		
		else if(usrImp.equals("0")) {
		//exit
			inputScan.close();
			break;
		}
		}
	}
	
}
