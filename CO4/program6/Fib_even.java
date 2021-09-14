import java.util.*;

class Thread1 implements Runnable{
int l;
Thread1(int n){
l=n;
}

public void run(){
int n1=0,n2=1,n3,i;    
System.out.print(n1+" "+n2);
for(i=2;i<l;++i)
{    
n3=n1+n2;    
System.out.print(" "+n3);    
n1=n2;    
n2=n3;    
}
}
}

class Thread2 implements Runnable{
int l;
Thread2(int n){
l=n;
}
public  void run(){
for(int i=1;i<=l;i++){
if(i%2 == 0)
System.out.println(i + "  ");
}
}
}


class Fib_even{
public static void main(String args[ ]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the limit");
int l=s.nextInt();
Thread1 m = new Thread1(l);
Thread t1=new Thread(m);
t1.start();

Thread2 t = new Thread2(l);
Thread t2=new Thread(t);
t2.start();

}
}