import java.util.Scanner;

class Shapes{
public void area(int x){
System.out.println("\n\tArea of Square : " +x*x);
}
public void area(int l, int w){
System.out.println("\n\tArea of rectangle : " +l*w);
}
public void area(double r){
double a = 3.14 * r * r;
System.out.println("\n\tArea of circle : " +a);
}
}

public class Shape{


public static void main(String args[]){
Shapes sh = new Shapes();
Scanner s = new Scanner(System.in);

System.out.println("Enter the length of  a Square: ");
int x = Integer.parseInt(s.nextLine());
System.out.println("\n\nEnter the length of  a rectangle: ");
int l = Integer.parseInt(s.nextLine());
System.out.println("Enter the width of  a rectangle: ");
int w = Integer.parseInt(s.nextLine());
System.out.println("\n\nEnter the radius of  a circle: ");
double r =s.nextDouble();

sh.area(x);
sh.area(l, w);
sh.area(r);
}
}



