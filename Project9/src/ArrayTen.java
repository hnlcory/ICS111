//Cory Parker - Section5
public class ArrayTen {

  private String myData[] = new String[10];

  public void set(int index, String value) {
	try {
    myData[index] = value;
	}
    catch(ArrayIndexOutOfBoundsException e){
		System.out.println("exception java.lang.IndexOutOfBoundsException");
		throw new IndexOutOfBoundsException();
	}
  }

  public String get(int index) {
	try {
	return myData[index];
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("exception java.lang.IndexOutOfBoundsException");
		throw new IndexOutOfBoundsException();
	}

  }

  public static void main(String[] args) {
	try {
	ArrayTen a = new ArrayTen();
    a.set(10, "hello world");
    System.out.println (a.get(10));
	}
	catch(IndexOutOfBoundsException e) {
		e.printStackTrace();
		
	}
  }

}