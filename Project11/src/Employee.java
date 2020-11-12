
public class Employee extends Person {
	
	int salary=0;
	
	public Integer setSalary(int salaryInput) {//save salary
		this.salary= salaryInput;
		return salaryInput;
	}
	
	public Integer getSalary(){//get just salary
		return this.salary;
	}
	
	public String toString(){//can be overridden 
		//return name, salary
		String returnPrintout = super.toString()+": Salary:"+salary;
		return returnPrintout;
	}
	
}
