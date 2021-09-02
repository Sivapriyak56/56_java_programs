import java.util.Scanner;

class Myexception extends Exception{
Myexception(){
super();
}
Myexception( String s){
super(s);
}
}

class Login{
public static void main(String args[]){
double un,name;
int i=0;
double pwd,pd;

Scanner s = new Scanner(System.in);
System.out.println("set user name :");
un =  s.nextDouble();
System.out.println("set password :");
pwd = s.nextDouble();

System.out.println("\n\tLOGIN");

System.out.println("\n\tenter user name :\n\t");
name =  s.nextDouble();
System.out.println("\n\tenter password :\n\t");
pd = s.nextDouble();
try{
if(un != name){
throw new Myexception(" invalid user name !!! ");
}
else
i =1;
}
catch(Myexception e){
System.out.println(e);
}
try{
if(pwd != pd){
throw new Myexception(" invalid password!!! ");
}
else
i = i + 1;
}
catch(Myexception e){
System.out.println(e);
}
try{ 
if(i!= 2){
throw new Myexception(" invalid  !!! ");
}
else
System.out.println("\n\tSuccessfully Login");
}
catch(Myexception e){
System.out.println(e);
}
}
}