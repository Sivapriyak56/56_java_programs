import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="key" width=200 height=300>
</applet>
*/

public class key extends Applet implements KeyListener{
TextField t;
TextArea ta;
public void init()
{
t=new TextField(20);
ta=new TextArea();
add(t);
add(ta);
t.addKeyListener(this);
}
public void keyPressed(KeyEvent ke)
{
if(ke.getSource()==t)
ta.append("keyPressed");
}
public void keyReleased(KeyEvent ke)
{
if(ke.getSource()==t)
ta.append("Key Released");
}
public void keyTyped(KeyEvent ke)
{
if(ke.getSource()==t)
{
char c=ke.getKeyChar();
ta.append("KeyTyped"+c);
}
}
}
