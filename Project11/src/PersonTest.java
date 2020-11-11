
public class PersonTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		ContactP cp1= new ContactP();
		Employee e1 = new Employee();
		
		
		String exampleNameInput1 = "Cory", exampleNameInput2 ="Kaya";
		String exampleSearch1 = "Cory", exampleSearch2= "Kaya";
		Integer exampleSal= 100;
		
		System.out.println("Contact test:");
		p1.saveName(exampleNameInput1);
		System.out.println("saved name is: "+p1.toString());
		
		if (p1.nameMatches(exampleSearch1).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		
		
		
		System.out.println("ContactP test:");
		cp1.saveName(exampleNameInput2);
		System.out.println("saved name is: "+cp1.toString());
		if (cp1.nameMatches(exampleSearch2).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		
		
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
	}

}
