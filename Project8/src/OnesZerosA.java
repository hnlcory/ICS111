import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

// Cory Parker Section 5
public class OnesZerosA {

	public static void main(String[] args) throws IOException {
		int lines =0;
		URL url = new URL("http://www2.hawaii.edu/~esb/2020fall.ics111/oneszeros.txt");
		Scanner scan = new Scanner(url.openStream());
		while (scan.hasNext()) {
			lines++;
			System.out.println(scan.nextLine());
			
		}
		System.out.println(lines);
		
	}

}
