import java.util.Scanner;
public class program4{
public static void main(String[] args){

int n, sum=0;
Scanner s = new Scanner(System.in);

int a[] = new int[5];
System.out.println("enter the elements: ");
for(int i = 0;i < 5;i++)
{
a[i] = s.nextInt();
}
System.out.println("Elements are :");
for(int j = 1; j <a.length;j=j+2)
{
System.out.println(a[j]);
}
}
}