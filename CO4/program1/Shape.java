package Graphics;

interface A{

void rectangle(int l, int w);
void triangle(double h,double b);
void square(int x);
void circle(double r);
}

public class Shape implements A {

public void rectangle(int l, int w){
System.out.println("\n\tArea of rectangle : " +l*w);
}
public void triangle(double h,double b){
double a = (h*b)/2;
System.out.println("\n\tArea of triangle : " +a);
}
public void square(int x){
System.out.println("\n\tArea of Square : " +x*x);
}
public void circle(double r){
double c = 3.14 * r * r;
System.out.println("\n\tArea of circle : " +c);
}
}