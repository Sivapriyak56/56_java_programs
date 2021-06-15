import java.io.*;
public class program2_BufferReader{
public static void main(String[] args)
throws IOException
{

BufferedReader s = new BufferedReader(new InputStreamReader(System.in));

int a[] = new int[5];
System.out.println("enter the elements: ");
for(int i = 0;i < 5;i++)
{
a[i] = Integer.parseInt(s.readLine());
}

System.out.println("Elements are :");
for(int j = 4; j<a.length;j--)
{
System.out.println(a[j]);
}
}
}