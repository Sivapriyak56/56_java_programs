import java.util.Scanner;

public class Search{


public static void main(String args[]){
int x;
int flag =0;
int i =0;

Scanner s = new Scanner(System.in);

int products[] = new int[5];
System.out.println("Enter some Numbers : ");
for(int j =0;j <5;j++)
{
products[j] = s.nextInt();
}
System.out.println("Enter the element to search :  ");
x = s.nextInt();
for(i =0;i <5;i++){
if(products[i] == x)
{
flag = 1;
break;
}
else{
flag = 0;
}
}
if(flag == 1){
System.out.println("Element found at position:" +(i+1));
}
else{
System.out.println(" Element not found");
}
}

}


