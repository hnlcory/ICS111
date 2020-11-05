import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Cory Parker Section 5
public class AddressBook {
	
	//private static Contact nextContact(Scanner in) {
		//tries to read the next contact from the given scanner.  This method returns null if there is no next contact 
	//}
	
	//private static String fileFormat(Contact c) {
		//returns a string representation of the contact for file save
	//}
	
	ArrayList <String> contactInfoAL = new ArrayList<String>();
	private String name;
	
	public void customException(){
	// a no-arguments constructor, which if invoked throws NoSuchElementException
		throw new NoSuchElementException();
	}
	
	
	public String saveName(String contactName) {
	//a constructor with a single String parameter, which saves that string as the name of the contact
		name = contactName;
		System.out.println("saving name: "+name);
		return contactName;	
		}
	
	
	public String getName() {
	//String getName(), which returns the name
		return name;	
	}
	
	
	public Boolean nameMatches(String search) {
	//returns true if the lowercase version of the name contains the lowercase version of the search string
		if(search.contains(name.toLowerCase())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addContactInformation(String contactInfo) {
	//which adds a new item of contact information
		System.out.println("saving contact info: "+contactInfo);
		contactInfoAL.add(contactInfo);
	}
	
	
	public String[] getContactInformation() {//***throws error
	//returns an array of all the contact information items added so far
	Object[] contactInfoA = contactInfoAL.toArray(); 
	String[] frmtContactInfo = new String[contactInfoA.length];
    System.arraycopy(contactInfoA, 0, frmtContactInfo, 0, contactInfoA.length);
    for(String string:frmtContactInfo) {
    	System.out.println(string);
    } 
	return frmtContactInfo;
	}

	public String toString() {
	//returns a string containing the values of all the instance variables
		return (name + contactInfoAL);		
	}
	
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
			System.out.println("file not found");	
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("no arguments found");
		}
		
		//main menu parts
		Scanner imputScan = new Scanner(System.in);
		AddressBook ab1 = new AddressBook();
		
		while (true) {
		//possibly need to make scanner > variable > compare since looping may be weird
		System.out.println("Enter 1 to add a new contact, 2 to print all, 3 to search, 4 to save, 0 to exit: ");
		Integer usrImp = imputScan.nextInt();
		
		if (usrImp ==1) {
			//add new contact
			Scanner nameScan = new Scanner(System.in);
			System.out.println("enter the contact information, or newline if done:");
			String nameImp = nameScan.nextLine();
			if(nameImp.equals("")) {
				
			}
			else {
				ab1.saveName(nameImp);
				while (true) {
					System.out.println("enter the contact information, or newline if done:");
					String infoImp = nameScan.nextLine();
					if(infoImp.equals("")) {
						break;
					}
					else {
						ab1.addContactInformation(infoImp);
						//add to arraylist
					}
					
				}
			}
		
		}
		else if(usrImp==2) {
		//print all
			System.out.println("two");
		}
		else if(usrImp==3) {
		//search **needs to check for all contacts, name + info
			Scanner searchScan = new Scanner(System.in);
			System.out.println("enter the string to search for: ");
			String searchImp = searchScan.nextLine();
			if(ab1.nameMatches(searchImp.toLowerCase()).compareTo(true) == 0) {
				System.out.println("match");
			}
			else {
				System.out.println("no match found");
			}
			
		}
		else if(usrImp==4) {
		//save
		}
		else if(usrImp==0) {
		//exit
			imputScan.close();
			break;
	
		}
		}
	}
}
