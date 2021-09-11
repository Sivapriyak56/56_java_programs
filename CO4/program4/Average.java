import java.util.Arrays;
import java.util.Scanner;

class Myexception extends Exception{
Myexception(){
super();
}
Myexception( String s){
super(s);
}
}

class Average{
public static void main(String args[]){
int n;
int j = 0;
int sum=0;
double avg =0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
n = s.nextInt();
int ar [] = new int[n];

for(int i = 0;i <n;i++){
ar[i] = s.nextInt();
}
for(int i = 0;i <n;i++){
try{
if(ar[i] < 0){
throw new Myexception(" Negative Number!!! ");
}
else
sum = sum + ar[i];
j = j + 1;
if(j == n){
avg = sum/n;
System.out.println("\n\t Avg = " + avg);
}
}
catch(Myexception e){
System.out.println(e);
}
}
}
}

