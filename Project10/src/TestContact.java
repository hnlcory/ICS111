// Cory Parker Section 5
public class TestContact {

	
	public static void main(String[] args){
		Contact c1 = new Contact(null);
		
		String sampleContactInfo1 = "name@gmail.com";
		String sampleContactInfo2 = "8081234567";
		String sampleContactInfo3 = "honolulu";
		
		String sampleName = "Cory";
		//TestContact c1 = new TestContact();
		c1.addContactInformation(sampleContactInfo1);
		c1.addContactInformation(sampleContactInfo2);
		c1.addContactInformation(sampleContactInfo3);
		c1.saveName(sampleName);
		if(c1.nameMatches("cory").equals(true)) {
			System.out.println("name search matches");
		}
		else {
			System.out.println("name mismatch");
		}
		System.out.println("saved name: "+c1.getName());
		System.out.print("saved contact info: ");
		c1.getContactInformation();
		System.out.println(c1.toString());
		System.out.println("triggering custom exception");
		c1.customException();
	}
	
}
