import java.util.Scanner;
public class program6{
public static void main(String[] args){


Scanner s = new Scanner(System.in);

int a[] = new int[5];
System.out.println("enter the elements: ");
for(int i = 0;i < 5;i++)
{
a[i] = s.nextInt();
}
int min = a[0];
System.out.println("smallest value  :");
for(int j = 1; j<a.length;j++)
{
if(min>a[j])
min = a[j];
}
System.out.println(min);
}
}
