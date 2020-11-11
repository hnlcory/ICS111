
public class Person {
	
	public String name;
	
	public String saveName(String contactName) {
		//saves that string as the name of the contact
			this.name = contactName;
			return this.name;	
			}

	public String toString() {
		//returns the name
			return this.name;	
		}
	
	public Boolean nameMatches(String search) {
		//returns true if the lowercase version of the name contains the lowercase version of the search string
			if(search.toLowerCase().contains(this.name.toLowerCase())) {
				return true;
			}
			else {
				return false;
			}
		}
}
