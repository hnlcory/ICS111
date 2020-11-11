
public class Manager extends Employee {

	String Department=null;
	
	public String saveDepartment(String departmentInput) {
		this.Department = departmentInput;
		return departmentInput;
	}
	
	public String getDepartment() {
		return this.Department;
	}
	
	public String toString(){//can be overridden - needs to show salary and department
		//return name
		super.toString();
		return super.toString();
	}
	
}
