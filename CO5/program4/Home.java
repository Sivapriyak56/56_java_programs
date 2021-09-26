import java.awt.*;    
import java.applet.*;    
import java.awt.event.*;

/* <applet code=Home.class height=400 width=450>
</applet> */


public class Home extends Applet implements MouseListener{
public void init(){ 
addMouseListener(this);  

}
public void paint(Graphics g){
int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
g.setColor(Color.yellow);
g.fillRect(150, 150, 150, 200); //House
g.setColor(Color.blue);
g.fillRect(200, 200, 50, 150); // Door
g.setColor(Color.black);
g.fillPolygon(x, y, 3); // Roof
}

 public void mouseClicked(MouseEvent e){    
Graphics g=getGraphics();  
g.setColor(Color.red);
g.fillRect(200, 200, 50, 150); // Door
}
 public void mouseEntered(MouseEvent e){
}
public void mouseExited(MouseEvent e){
}
 public void mousePressed(MouseEvent e){       
}
 public void mouseReleased(MouseEvent e){ 
}

}

