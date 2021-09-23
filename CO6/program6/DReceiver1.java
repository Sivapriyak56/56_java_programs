import java.io.*;
import java.net.*;

public class DReceiver1{
public static void main(String args[]) throws Exception{
DatagramSocket ds= new DatagramSocket(3000);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
byte[] buf =new byte[1024];

String str=" ";
while(!str.equals("stop")){
DatagramPacket d = new DatagramPacket(buf,1024);
ds.receive(d);
String str2 =new String(d.getData(), 0,d.getLength());
System.out.println("Sender says :" +str2);
str = br.readLine();
InetAddress ip = InetAddress.getLocalHost();
DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,5000);
ds.send(dp);

}
}
}



