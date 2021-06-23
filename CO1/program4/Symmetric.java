import java.util.Scanner;

public class Symmetric{

public static void main(String args[]){

Scanner s = new Scanner(System.in);

int r,c;

System.out.println("enter number of rows:");
r = s.nextInt();
System.out.println("enter number of rows:");
c = s.nextInt();

int a[][] = new int[r][c];
int b[][] = new int[r][c];

System.out.println("enter  rows:");
for(int i=0;i <r;i++){
for(int j=0;j <c;j++){
a[i][j] = s.nextInt();
}
}

if(r==c){
for(int i=0;i <r;i++){
for(int j=0;j <c;j++){
b[i][j] =a[j][i];
}
}
}
int x=0;
for(int i=0;i <r;i++)
for(int j=0;j <c;j++)
if(a[i][j] == b[i][j]){
x=1;
}

if(x==1){
System.out.println("Matrix is symmetric");
}
else{
System.out.println("Matrix is not symmetric");

}
}
}