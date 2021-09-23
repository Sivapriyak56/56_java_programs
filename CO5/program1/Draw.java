import java.applet.*;
import java.awt.*;

/*<applet code="Draw" height="500" width="500">
</applet>
*/

public class Draw extends Applet{
public void paint(Graphics g){
g.drawOval(80, 70, 150, 150);
g.fillOval(120, 120, 15, 15);
g.fillOval(170, 120, 15, 15);
g.drawArc(130, 180, 50, 20, 180, 180);
g.drawLine(150,152,150,130);
g.fillRect(90, 230, 150, 150);
}
}
