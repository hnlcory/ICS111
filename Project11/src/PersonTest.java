
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		String exampleNameInput = "Cory";
		String exampleSearch = "Cory";
		
		
		p1.saveName(exampleNameInput);
		System.out.println("saved name is: "+p1.toString());
		
		if (p1.nameMatches(exampleSearch).equals(true)) {
			System.out.println("search match");
		}
		else {
			System.out.println("search name not found");
		}
	}

}
