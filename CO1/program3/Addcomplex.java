class Complex_num{
double real;
double image;

void addcomplex(Complex_num c1){
System.out.println((c1.real + real) + "+" +(image +c1.image) + "i");
}
}

public class Addcomplex{
public static void main(String[] args){

Complex_num c1 = new Complex_num(); 
Complex_num c2 = new Complex_num(); 


c1.real = 5 ;
c1.image =4; 

c2.real = 9;
c2.image =2; 

c2.addcomplex(c1);
}
}