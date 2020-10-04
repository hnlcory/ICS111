//Cory Parker Section 5 - note: 10th row shows up somewhat out of bottom fame
//TODO 
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Random;

public class Circles {

  public static void draw(Graphics g)
  {
    g.setColor(Color.MAGENTA);
    g.fillOval(10, 10, 40, 40);//Big Oval
    // your code goes here
    Random ranColor = new Random();
    
    int yAxis = 0;
    
    for (int i=0; i<10; i++) {//row
    	
    	int column =0; //column
    	int xAxis =0;
    	
    	if (i<2) {//stop circles form bring drawn top left,continue
    		column=2;
    		xAxis=80;
    	}
    	
    	for(; column <10; column++) {//circles created in 10
    		Color finalColor= new Color(ranColor.nextFloat(), ranColor.nextFloat(), ranColor.nextFloat());//rgb new random color type
    		g.setColor(finalColor);//Small Ovals
    		g.fillOval(xAxis, yAxis, 10, 10);//pos, pos,size,size
    		xAxis= xAxis+40;//add 40 for x to make new circles even left,right
    	}
    	yAxis= yAxis+40;//add 40 for y to make circle even up,down
    }
  }

  // do not modify anything below this
  public static void main(String[] a)
  {
    JFrame frame = new JFrame();
    int frameWidth = 400;
    int frameHeight = 400;
    frame.setSize(frameWidth, frameHeight);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    javax.swing.JComponent component = new javax.swing.JComponent()
    {
      public void paintComponent(Graphics graph)
      {
        draw(graph);
      }
    };

    frame.add(component);
    frame.setVisible(true);
  }
}