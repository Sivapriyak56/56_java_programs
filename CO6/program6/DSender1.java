import java.io.*;
import java.net.*;

public class DSender1{
public static void main(String args[]) throws Exception{
DatagramSocket ds= new DatagramSocket(5000);


InetAddress ip = InetAddress.getLocalHost();

byte[] buft =new byte[1024];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str=" ",str2=" ";
while(!str.equals("stop")){
str = br.readLine();
DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
ds.send(dp);

DatagramPacket d= new DatagramPacket(buft,1024);
ds.receive(d);
str2 =new String(d.getData(), 0,d.getLength());
System.out.println("Receiver says :" +str2);
}
ds.close();
}
}

