
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		ContactP cp1= new ContactP();
		String exampleNameInput = "Cory";
		String exampleSearch = "kaya";
		
		System.out.println("Contact test:");
		p1.saveName(exampleNameInput);
		System.out.println("saved name is: "+p1.toString());
		
		if (p1.nameMatches(exampleSearch).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
		
		System.out.println("ContactP test:");
		cp1.saveName(exampleNameInput);
		System.out.println("saved name is: "+cp1.toString());
	}

}
