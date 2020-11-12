
public class Manager extends Employee {

	String Department=null;
	
	public String setDepartment(String departmentInput) {//save department name
		this.Department = departmentInput;
		return departmentInput;
	}
	
	public String getDepartment() {//return just department
		return this.Department;
	}
	
	public String toString(){//can be overridden 
		//return name, salary, and department
		String printout =super.toString()+" Department:"+Department;
		return printout;
	}
	
}
