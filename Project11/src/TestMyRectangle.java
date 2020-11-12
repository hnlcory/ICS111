
public class TestMyRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exWidth =3, exLength =7;
		
		
		MyRectangle mr1 = new MyRectangle(exWidth,exLength);
		System.out.println("perimeter: "+mr1.getPerimeter());
		System.out.println("area: "+mr1.getArea());
	}

}
