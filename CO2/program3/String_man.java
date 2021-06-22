import java.util.Scanner;
public class String_man{
public static void main(String[ ] args){

Scanner s = new Scanner(System.in);

System.out.println("Enter a string: ");
String st = s.nextLine();
System.out.println("Enter another string: ");
String str = s.nextLine();

String stri = st + str;

System.out.println("combination of two string: " + stri);

}
}


