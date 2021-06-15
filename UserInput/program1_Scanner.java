import java.util.Scanner;
public class program1_Scanner{
public static void main(String[] args){


Scanner s = new Scanner(System.in);

int a[] = new int[5];
System.out.println("enter the elements: ");
for(int i = 0;i < 5;i++)
{
a[i] = s.nextInt();
}
System.out.println("Elements are :");
for(int j = 0; j <a.length;j++)
{
System.out.println(a[j]);
}
}
}
