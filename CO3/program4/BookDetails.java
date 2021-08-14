import java.util.Scanner;

class Publisher{
String name;

public void pub_Nm(){
Scanner s = new Scanner(System.in);
System.out.println("enter publisher");
name =  s.nextLine();
}
void pub_dis(){
System.out.println(" piblisher name : " + name);
}
}

class Book extends Publisher {
String bk_name;
String au_name;
double page_num;
void Bk(){
Scanner s = new Scanner(System.in);

System.out.println("enter book name");
bk_name =  s.nextLine();
System.out.println("enter author name");
au_name =  s.nextLine();
System.out.println("How many pages");
page_num = s.nextDouble();
}
void bk_dis(){
System.out.println(" book name : " + bk_name);
System.out.println(" auther name : " + au_name);
System.out.println(" pages : " + page_num);
}
}

class Literature extends Publisher{
String bk_lng;
void Lit(){
Scanner s = new Scanner(System.in);

System.out.println("enter language");
bk_lng =  s.nextLine();
}
void lit_dis(){
System.out.println(" Literature name : " + bk_lng);
}
}

class Fiction extends Publisher{
String bk_fic;
void Fic(){
Scanner s = new Scanner(System.in);

System.out.println("fiction type");
bk_fic =  s.nextLine();
}
void fic_dis(){
System.out.println("fiction type : " + bk_fic);
}
}

public class BookDetails{
public static void main(String args[]){

Book b = new Book();
Literature l = new Literature();
Fiction f = new Fiction();

b. pub_Nm();
b. Bk();
l.Lit();
f.Fic();


System.out.println("\n\tSelect any category");
System.out.println("\n\t 1.Publisher" + "\n\t 2.Book" + "\n\t 3.Literature" + "\n\t 4.Fiction");

Scanner r = new Scanner(System.in);
int cat = Integer.parseInt(r.nextLine());
if(cat == 1){
b.pub_dis();
}
if(cat == 2){
b.bk_dis();
}
if(cat == 3){
l.lit_dis();
}
if(cat == 4){
f.fic_dis();
}


}
}
 