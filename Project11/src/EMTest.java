
public class EMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		
		String exampleNameInput1 = "Cory", exampleNameInput2 ="Kaya";
		String exampleSearch1 = "Cory", exampleSearch2= "Kaya";
		Integer exampleSal= 100;
		
		System.out.println("Employee test:");
		e1.saveName(exampleNameInput2);
		System.out.println("saved name is: "+e1.toString());
		if (e1.nameMatches(exampleSearch2).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		e1.saveSalary(exampleSal);
		System.out.println("saved sal: "+e1.getSalary());
		
		
		System.out.println("Manager Test:");
		m1.saveName(exampleNameInput1);
		m1.saveDepartment("Sales");
		System.out.println(m1.getDepartment());
		System.out.println("saved name is: "+m1.toString());
		if (m1.nameMatches(exampleSearch1).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		System.out.println(m1.toString());

	}

}
