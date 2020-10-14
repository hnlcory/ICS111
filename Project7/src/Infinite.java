/*
Exception in thread "main" java.lang.StackOverflowError
at Infinite.inf(Infinite.java:5)
at Infinite.inf(Infinite.java:5)
 */

//Cory Parker Section 5
public class Infinite {
	
	public static void inf() {
		inf();
	}

	public static void main(String[] args) {
		inf();

	}

}
