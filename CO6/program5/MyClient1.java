import java.net.*;
import java.io.*;

public class MyClient1{
public static void main(String args[ ]){

try{
Socket s = new Socket("localhost",3333);
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
DataInputStream dis =new DataInputStream(s.getInputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str=" ",str2=" ";
while(!str.equals("stop")){
str=br.readLine();
dos.writeUTF(str);
dos.flush();
str2=dis.readUTF();
System.out.println("Server says: "+str2);
}
dos.close();
s.close();
}
catch(Exception e){
System.out.println(e);
}
}
}