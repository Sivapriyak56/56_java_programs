package Arithmatic;

interface A{

void add(int a, int b);
void sub(int a, int b);
void mul(int a, int b);
void div(int a, int b);
}

public class Num implements A {

public void add(int a, int b){
int sum = a+b;
System.out.println("\n\tAddition : " + sum);
}
public void sub(int a, int b){
int s = a-b;
System.out.println("\n\tSubstraction: " + s);
}
public void mul(int a, int b){
System.out.println("\n\tMultiplication: " + a*b);
}
public void div(int a, int b){
System.out.println("\n\tDivision : " + a/b);
}
}