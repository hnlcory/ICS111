//NOT FINAL
//chapter 4.3
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Random;

public class Circles2 {

  public static void draw(Graphics g){
	
	g.setColor(Color.MAGENTA); //for oval in top 
	g.fillOval(10, 10, 40, 40); //x,y chord , size, size
	
	
	
	Random rand=new Random();
	
   
	// your code goes here
    int count=1;
    while (count < 10) {
    	for(int x=0;x<400;x+=40){
    		for(int y=0;y<400;y+=40){
    		Color color=new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());
    		g.setColor(color);
    		g.fillOval(x,y,10,10);
    		count++;
    		}
  
    		
    	}
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