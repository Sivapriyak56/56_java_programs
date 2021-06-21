import java.util.Scanner;
import java.util.Arrays;

public class Sort{
public static void main(String[] args){

System.out.println("enter some strings");

String a[] = new String[5];
Scanner s = new Scanner(System.in);
for(int i = 0;i<5;i++)
{
a[i]  = s.nextLine();
}
System.out.println("After sorting : ");
Arrays.sort(a);
System.out.println(Arrays.toString(a));

}
}
 
