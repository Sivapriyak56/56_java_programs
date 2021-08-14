package Area;
import java.util.Scanner;



public class Area{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of  a Square: ");
int x = Integer.parseInt(s.nextLine());
System.out.println("\n\nEnter the length of  a rectangle: ");
int l = Integer.parseInt(s.nextLine());
System.out.println("Enter the width of  a rectangle: ");
int w = Integer.parseInt(s.nextLine());
System.out.println("\n\nEnter the radius of  a circle: ");
double r =s.nextDouble();
System.out.println("\n\nEnter the height of  a rectangle: ");
double h =s.nextDouble();
System.out.println("Enter the base of  a rectangle: ");
double b =s.nextDouble();

Graphics.Shape g = new Graphics.Shape();
g.square(x);
g.rectangle(l,w);
g.circle(r);
g.triangle(b,h);

}
}