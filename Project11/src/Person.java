
public class Person {
	
	public String name;
	
	public String saveName(String contactName) {
		//saves that string as the name of the contact
			name = contactName;
			return contactName;	
			}

	public String toString() {
		//String getName(), which returns the name
			return name;	
		}
	
	public Boolean nameMatches(String search) {
		//returns true if the lowercase version of the name contains the lowercase version of the search string
			if(search.toLowerCase().contains(name.toLowerCase())) {
				return true;
			}
			else {
				return false;
			}
		}
}
