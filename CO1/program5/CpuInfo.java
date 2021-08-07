import java.util.Scanner;

class CPU {
double price;
 
CPU(double price){
this.price = price;
}

class Processor {
int no_of_cores;
String manufacturer;

void processorInfo(){
Scanner n = new Scanner(System.in);
System.out.println("enter no. of cores");
no_of_cores = Integer.parseInt(n.nextLine());
System.out.println("enter manufacturer");
manufacturer = n.nextLine();
}
}

static class Ram {
static int memory;
static String manufacturer;

static void ramInfo(){
Scanner r = new Scanner(System.in);
System.out.println("enter memory");
memory= Integer.parseInt(r.nextLine());
System.out.println("enter manufacturer");
manufacturer = r.nextLine();
}
}
void display(){
Processor p =new Processor();
p.processorInfo();
Ram.ramInfo();
System.out.println("Processor Information");
System.out.println("no. of cores : " + p.no_of_cores   +  "  ,  manufacturer : " + p.manufacturer);
System.out.println("Ram Information");
System.out.println("memory : " + Ram.memory   +  "  ,  manufacturer : " + Ram.manufacturer);
}
}
public class CpuInfo{
public static void main(String[ ] args){
Scanner s = new Scanner(System.in);
System.out.println("enter price");
double price= s.nextDouble();

CPU c = new CPU(price);
c.display();
}
}

