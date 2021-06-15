import java.util.Scanner;
public class program7{
public static void main(String[] args){

int n, sum=0;
Scanner s = new Scanner(System.in);

int a[] = new int[5];
System.out.println("enter the elements: ");
for(int i = 0;i < 5;i++)
{
a[i] = s.nextInt();
}
int count = 0;
System.out.println("length of array:);
for(int j = 0; j <a.length;j++)
{
count = count + 1;
}
System.out.println(count);
}
}