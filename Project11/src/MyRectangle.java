
public class MyRectangle extends java.awt.Rectangle{
	
	public MyRectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public Integer getPerimeter(){
		int widthI=super.width;
		int heightI=super.height;
		
		System.out.println(widthI);
		System.out.println(heightI);
	
		widthI=widthI*2;
		heightI=heightI*2;
		int perimeter = (int)heightI+(int)widthI;
		return perimeter;
	}
	
	
	public Integer getArea(){
		int widthI=super.width;
		int heightI=super.height;
		int area=heightI*widthI;
		return area;
	}
	
}
