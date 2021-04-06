import java.awt.*;
public class DrawingPanel
{
   public static void draw(Point p, Graphics g)
   {
      g.fillOval(p.x, p.y, 3, 3);
      g.drawString("("+p.x + ", " + p.y + ")", p.x, p.y);
   }
   
   
}