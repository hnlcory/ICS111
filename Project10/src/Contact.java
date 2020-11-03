import java.util.NoSuchElementException;
import java.util.ArrayList;




// Cory Parker Section 5
public class Contact {

	ArrayList <String> contactInfoAL = new ArrayList<String>();
	private String name;
	
	public static void customException(){
	// a no-arguments constructor, which if invoked throws NoSuchElementException
		throw new NoSuchElementException();
	}
	
	
	public String saveName(String contactName) {
	//a constructor with a single String parameter, which saves that string as the name of the contact
		contactName = name;
		return contactName;		
		}
	
	
	public String getName() {
	//String getName(), which returns the name
		System.out.println(name);
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
	contactInfoAL.add(contactInfo);
	}
	
	
	public String[] getContactInformation() {
	//returns an array of all the contact information items added so far
	Object[] contactInfoA = contactInfoAL.toArray(); 
	for (Object obj : contactInfoA) { 
        System.out.print(obj + " ");
		}
	return (String[]) contactInfoA;
	}

	public String toString() {
	//returns a string containing the values of all the instance variables
		return (name + contactInfoAL);
			
	}
	
}
