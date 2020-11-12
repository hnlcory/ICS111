
public class PersonTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		ContactP cp1= new ContactP();
		
		
		String exampleNameInput1 = "Cory", exampleNameInput2 ="Kaya";
		String exampleSearch1 = "Cory", exampleSearch2= "Kaya";

		
		System.out.println("--- Contact test ---");
		p1.setName(exampleNameInput1);
		System.out.println("saved name is: "+p1.toString());
		
		if (p1.nameMatches(exampleSearch1).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		
		
		
		System.out.println("\n--- ContactP test ---");
		cp1.setName(exampleNameInput2);
		System.out.println("saved name is: "+cp1.toString());
		if (cp1.nameMatches(exampleSearch2).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		
		
	}

}
