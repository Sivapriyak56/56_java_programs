import java.awt.*;
import java.applet.*;

/* <applet code=Maximum height=150 width=400>
<param name=num1 value=10>
<param name=num2 value=15>
<param name=num3 value=102>
</applet> */

public class Maximum extends Applet{
int result;

public void start(){
int a, b, c;
String param;

param=getParameter("num1");
a=Integer.parseInt(param);
param=getParameter("num2");
b=Integer.parseInt(param);
param=getParameter("num3");
c=Integer.parseInt(param);

if (a>b) {
 if (a>c)
result=a;
else
result=c;
}
else{
if (b>c) 
result=b;
else
result=c;
}

}
public void paint(Graphics g){
g.drawString("Maximnum of 3 No is: " +result,10,70);         

 }
}     
