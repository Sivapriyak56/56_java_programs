class Product{
String pcode;
String pname;
double price;

String compare(Product p1, Product p2){
if(p1.price < p2.price &&p1.price < price){
return p1.pname;
}
if(p2.price < p1.price && p2.price < price){
return p2.pname;
}
else{
return pname;
}
}
}
public class Products{
public static void main(String args[]){

Product p1 = new Product();
Product p2 = new Product();
Product p3 = new Product();

p1.pcode = ("s1");
p1.pname=( "i phone");
p1.price=(56000);

p2.pcode = ("d1");
p2.pname=( "samsang");
p2.price=(25000);

p3.pcode = ("g1");
p3.pname=( "redmi");
p3.price=(21000);

String l_product = p3.compare(p1, p2);
System.out.println("lowest price product is :" +  l_product );
}
}
