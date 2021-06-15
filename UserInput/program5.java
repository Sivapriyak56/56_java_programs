import java.util.Scanner;
public class program5{
public static void main(String[] args){


Scanner s = new Scanner(System.in);

int a[] = new int[5];
System.out.println("enter the elements: ");
for(int i = 0;i < 5;i++)
{
a[i] = s.nextInt();
}
int max = a[0];
System.out.println("largest value are :");
for(int j = 1; j<a.length;j++)
{
if(a[j]>max)
max = a[j];
}
System.out.println(max);
}
}
