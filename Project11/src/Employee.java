
public class Employee extends Person {
	
	int salary=0;
	
	public Integer saveSalary(int salaryInput) {
		this.salary= salaryInput;
		return salaryInput;
	}
	
	public Integer getSalary(){
		return this.salary;
	}
	
	public String toString(){//can be overridden - needs to show salary too
		//return name
		super.toString();
		return super.toString();
	}
	
}
