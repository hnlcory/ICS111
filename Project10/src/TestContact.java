import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
// Cory Parker Section 5
public class TestContact {

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
		String sampleContactInfo = "name@gmail.com";
		String sampleName = "Cory";
		TestContact tc1 = new TestContact();
		tc1.addContactInformation(sampleContactInfo);
		tc1.saveName(sampleName);
		if(tc1.nameMatches("cory").equals(true)) {
			System.out.println("name search matches");
		}
		else {
			System.out.println("name mismatch");
		}
		System.out.println("saved name: "+tc1.getName());
		System.out.print("saved contact info: ");
		tc1.getContactInformation();
		System.out.println("triggering custom exception");
		tc1.customException();
	}
	
}
