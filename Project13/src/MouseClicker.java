import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClicker extends MouseAdapter {

   // usually better off with mousePressed rather than clicked
   public void mousePressed(MouseEvent e) {
      System.out.println(e.getSource());
      System.out.println(e.getX()+", "+e.getY());
      System.out.println();
      
      
   }
}