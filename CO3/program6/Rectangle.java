import java.util.Scanner;

interface Area{
void area();
}

interface Perimeter{
void perimeter();
}


class Circle implements Area,Perimeter{
double r;
public void area(){
Scanner s = new Scanner(System.in);
System.out.println("Enter radius");
 r = s.nextDouble();
double A =3.14 * r *r;
System.out.println("Area :" + A);
}

public void perimeter(){
double C =2*3.14 * r;
System.out.println("Perimeter : " + C);
}
}

class Rectangle implements   Area,Perimeter{
double l ;
double w ;
public void area(){
Scanner s = new Scanner(System.in);
System.out.println("Enter length");
l = s.nextDouble();
System.out.println("Enter width");
w = s.nextDouble();
double A =w*l;
System.out.println("Area :" + A);
}

public void perimeter(){
double C =2*(l+w);
System.out.println("Perimeter : " + C);
}

public static void main(String args[]){
Circle ci = new Circle();
Rectangle re = new Rectangle();

System.out.println("Select a shape");
System.out.println("\n\t 1.Circle" + "\n\t 2.Rectangle");

Scanner r = new Scanner(System.in);
int n = Integer.parseInt(r.nextLine());

if(n == 1){
ci.area();
ci.perimeter();
}
if(n==2){
re.area();
re.perimeter();
}

}
}
