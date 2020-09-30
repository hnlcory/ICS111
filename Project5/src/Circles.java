//chapter 4.3
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Circles {

  public static void draw(Graphics g)
  {
    g.setColor(Color.MAGENTA);
    g.fillOval(10, 10, 40, 40);
    // your code goes here

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