import java.io.*;
class L
{	
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
if(a>b && a>c)
{
System.out.println("a is large");
}
if(a<b && c<b)
{
System.out.println("b is large");
}	
if(c>a && c>b)
{
System.out.println("c is large");
}
}
}
