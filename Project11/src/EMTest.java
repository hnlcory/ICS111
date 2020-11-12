
public class EMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		
		String exampleNameInput1 = "Cory", exampleNameInput2 ="Kaya";
		String exampleSearch1 = "cory", exampleSearch2= "kaya";
		Integer exampleSal= 100;
		
		System.out.println("---Employee test---");
		e1.setName(exampleNameInput2);
		
		System.out.println("testing search, should find match");
		if (e1.nameMatches(exampleSearch2).equals(true)) {
			System.out.println("search match found");
		}
		else {
			System.out.println("search name not found");
		}
		e1.setSalary(exampleSal);
		System.out.println("saved sal: "+e1.getSalary());
		System.out.println("toString results in: "+e1.toString());
		
		
		System.out.println("---Manager Test---");
		m1.setName(exampleNameInput1);
		m1.setDepartment("Sales");
		System.out.println(m1.getDepartment());
		m1.setSalary(100);
		System.out.println("saved sal: "+m1.getSalary());
		System.out.println("testing search, should find match");
		if (m1.nameMatches(exampleSearch1).equals(true)) {
			System.out.println("search match found");
		}
		else {
			System.out.println("search name not found");
		}
		System.out.println("toString results in: "+m1.toString());

	}

}
