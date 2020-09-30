import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.Random;

public class Circles2 {

  public static void draw(Graphics g)
  {
    g.setColor(Color.MAGENTA);
    g.fillOval(10, 10, 40, 40);
    // your code goes here
    Random random = new Random();
    
    int y = 0;
    for (int r=0; r<10; r++) {
    	int x =0;
    	
    	int c =0; //colum
    	
    	if (r<2) {
    		x=80;
    		c=2;
    	}
    	
    	
    	for(; c <10; c++) {
    		Color colorNew= new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
    		
    		//sets colors for small circle
    		g.setColor(colorNew);
    		// draw circles
    		g.fillOval(x, y, 10, 10);
    		
    		//incrament x values to add circle for x pos
    		x+=40;	
    	}
    	y+=40;
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