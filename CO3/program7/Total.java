import java.util.Scanner;
import java.util.Arrays;

interface Product{
void product_id();
void name();
void quantity();
void price();
}

class Total implements Product{

String name;
int id;
int qn;
double p;
double t;

Scanner s = new Scanner(System.in);


public void product_id(){
System.out.println("Enter product Id : ");
id = Integer.parseInt(s.nextLine());
}
public void name(){
System.out.println("Enter Name of product : ");
name = s.nextLine();
}

public void quantity(){
System.out.println("Enter quantity : ");
qn = Integer.parseInt(s.nextLine());
}

public void price(){
System.out.println("Enter price : ");
p = s.nextDouble();
}
public void total_price(){
System.out.println("Enter total : ");
t = s.nextDouble();
}

void display(){
System.out.println(id+"            "+name+"       "+qn+"            "+p+"       "+t);
}

public static void main(String args[]){

Scanner r = new Scanner(System.in);
System.out.println(" How many products");
int n = Integer.parseInt(r.nextLine());
Total tl[] = new Total[n];

for(int i =0; i < n;i++){
tl[i] = new Total();
}

for(int i =0; i < n;i++){
tl[i].product_id();
tl[i].name();
tl[i].quantity();
tl[i].price();
tl[i].total_price();
}

System.out.println("\n\nDate :   ");
System.out.println("\nProduct Id    Name    Quantity    unit price   Total ");
System.out.println("----------------------------------------------------");

for(int i =0; i < n;i++){  
tl[i].display();
}
double sum = 0;
for(int i =0; i < n;i++){ 
sum = sum+tl[i].t;
}
System.out.println("----------------------------------------------------");
System.out.println("                                     net weight:"+sum); 
}
}




