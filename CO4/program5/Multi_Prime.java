class Mul{
synchronized void printmul(int n){
System.out.println("Multiplication table");
for(int i =1;i<=10;i++){
System.out.println(i + " * " + n + "=" + (i*n));
try{
Thread.sleep(200); 
}
catch(Exception e)
{
System.out.println(e);
}
}
}

synchronized void printprime(int n){
System.out.println("Prime numbers");
int st =1;
int num =3;
if(n >= 1){
System.out.println(2);
}
for(int i=2;i<n;i++)
{
for(int j=2;j <=Math.sqrt(num);j++)
{
if(num%j ==0)
{
st =0;
break;
}
}
if(st !=0)
{
System.out.println(num);
i++;
}
st=1;
num++;
}
}
}

class Thread1 extends Thread{
Mul p;
Thread1(Mul p){
this.p=p;
}
public void run(){
p.printmul(5);
}
}


class Thread2 extends Thread{
Mul p;
Thread2(Mul p){
this.p=p;
}
public void run(){
p.printprime(10);
}
}


public class Multi_Prime{
public static void main(String args[]){
Mul obj = new Mul();
Thread1 p1=new Thread1(obj);
Thread2 p2=new Thread2(obj);
p1.start();
p2.start();
}
}