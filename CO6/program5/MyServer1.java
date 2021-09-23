import java.io.*;
import java.net.*;

public class MyServer1{
public static void main(String args[]){

try
{
ServerSocket ss=new ServerSocket(3333);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str=" ", str2=" ";
while(!str.equals("stop")){
str =dis.readUTF();
System.out.println("Client says: " +str);
str2=br.readLine();
dout.writeUTF(str2);
dout.flush();
}

dis.close();
ss.close();
s.close();
}
catch(Exception e){
System.out.println(e);
}
}
}