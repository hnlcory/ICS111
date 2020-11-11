
public class Employee extends Person {
	
	int salary=0;
	
	public Integer saveSalary(int salaryInput) {
		this.salary= salaryInput;
		return salaryInput;
	}
	
	public Integer getSalary(){
		return this.salary;
	}
	
	public String toString(){//can be overridden
		//return name
		super.toString();
		return super.toString();
	}
	
	public String saveName(String contactName){
		//save name
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
