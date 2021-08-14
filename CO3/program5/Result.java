import java.util.Scanner;

interface Student {
void print();
}

interface Sports {
void show();
}

class Result implements  Student,Sports{
public void print(){
double maths;
double it;
double social;
Scanner s = new Scanner(System.in);
System.out.println("Student Academic Score");
System.out.println("Enter maths score:");
maths =s.nextDouble();
System.out.println("Enter IT score:");
it =s.nextDouble();
System.out.println("Enter Social score:");
social =s.nextDouble();
System.out.println("\n\t Academic score");
System.out.println("\n\t Math score: " +maths +"\n\t IT score: "+it+"\n\t social score: "+social+"\n");
}
public void show(){
int football;
double long_jumb;
double high_jumb;
Scanner p = new Scanner(System.in);
System.out.println("Student Sports Score");
System.out.println("Enter football score:");
football =Integer.parseInt(p.nextLine());
System.out.println("Enter long_jumb score:");
long_jumb=p.nextDouble();
System.out.println("Enter high_jumb score:");
high_jumb =p.nextDouble();
System.out.println("\n\t Sports score");
System.out.println("\n\t football score: "+football+"\n\t long_jumb score: "+long_jumb+"\n\t high_jumb score :"+high_jumb );
}


public static void main(String args[]){
Result obj = new Result();
obj.print();
obj.show();

}
}


