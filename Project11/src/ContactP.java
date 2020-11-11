
public class ContactP extends Person {

	public String toString(){//not sure if correct usage of super
		super.toString();
		return super.toString();
	}
	
	public String saveName(String contactName){
		super.saveName(contactName);
		return super.name;
		
	}
	
	public Boolean nameMatches(String search) {
		//returns true if the lowercase version of the name contains the lowercase version of the search string
			if(search.toLowerCase().contains(super.name.toLowerCase())) {
				return true;
			}
			else {
				return false;
			}
		}
}
