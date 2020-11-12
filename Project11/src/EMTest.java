
public class EMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		
		String exampleNameInput1 = "Cory", exampleNameInput2 ="Kaya";
		String exampleSearch1 = "cory", exampleSearch2= "kaya";
		String exampleDepartment="Sales";
		Integer exampleSal= 100;
		
		System.out.println("---Employee test---");
		System.out.println("setting name...");
		e1.setName(exampleNameInput2);
		System.out.println("setting sal...");
		e1.setSalary(exampleSal);
		System.out.println("saved sal: "+e1.getSalary());
		System.out.println("testing search, should find match '"+exampleSearch2+"'");
		if (e1.nameMatches(exampleSearch2).equals(true)) {
			System.out.println("search match found!");
		}
		else {
			System.out.println("search name not found");
		}
		System.out.println("toString results in: "+e1.toString());
		
		
		System.out.println("\n\n---Manager Test---");
		System.out.println("setting name...");
		m1.setName(exampleNameInput1);
		System.out.println("setting department...");
		m1.setDepartment(exampleDepartment);
		System.out.println("setting sal...");
		m1.setSalary(100);
		System.out.println("saved department: "+m1.getDepartment());
		System.out.println("saved sal: "+m1.getSalary());
		System.out.println("testing search, should find match '"+exampleSearch1+"'");
		if (m1.nameMatches(exampleSearch1).equals(true)) {
			System.out.println("search match found!");
		}
		else {
			System.out.println("search name not found");
		}
		System.out.println("toString results in: "+m1.toString());

	}

}
