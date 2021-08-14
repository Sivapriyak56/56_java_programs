package Pack_Arith;
import java.util.Scanner;

public class Numbers{
public static void main(String args[]){
Scanner s = new Scanner(System.in);

System.out.println("Enter a number: ");
int a = s.nextInt();
System.out.println("\nEnter another number: ");
int b = s.nextInt();
Arithmatic.Num g = new Arithmatic.Num();
g.add(a,b);
g.sub(a,b);
g.mul(a,b);
g.div(a,b);

}
}