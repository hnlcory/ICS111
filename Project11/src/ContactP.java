
public class ContactP extends Person {

	public String toString(){//can be overridden
		//return name
		super.toString();
		return super.toString();
	}
	
	public String saveName(String contactName){//overrides?
		//save name
		super.saveName(contactName);
		return super.name;
		
	}
	
	public Boolean nameMatches(String search) {//overrides?
		//returns true if the lowercase version of the name contains the lowercase version of the search string
			if(search.toLowerCase().contains(super.name.toLowerCase())) {
				return true;
			}
			else {
				return false;
			}
		}
}
