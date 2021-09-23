import java.awt.*;
import java.applet.*;

/* <applet code=Markface height=500 width=500>
<param name=num1 value=30>
<param name=num2 value=35>
<param name=num3 value=52>
<param name=num4 value=50>
<param name=num5 value=35>
</applet> */

public class Markface extends Applet{
float percen;
public void init(){
}
public void start(){
int a,b,c,d,e;
String param;

param=getParameter("num1");
a=Integer.parseInt(param);
param=getParameter("num2");
b=Integer.parseInt(param);
param=getParameter("num3");
c=Integer.parseInt(param);
param=getParameter("num4");
d=Integer.parseInt(param);
param=getParameter("num5");
e=Integer.parseInt(param);

int sum=a+b+c+d+e;
float di = sum*100;
percen = di/500;
}

public void paint(Graphics g){
g.drawString("percentage:" +percen+"%",10,80);
if(percen > 50){
g.drawOval(80, 70, 150, 150);
g.fillOval(120, 120, 15, 15);
g.fillOval(170, 120, 15, 15);
g.drawArc(130, 180, 50, 20, 180, 180);
}
else
g.drawOval(80, 70, 150, 150);
g.fillOval(120, 120, 15, 15);
g.fillOval(170, 120, 15, 15);


}
}
