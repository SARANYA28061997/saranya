import java.io.*;
import java.util.*;
public class REVERSE
{
public static void main(String args[])	
{
Scanner s=new Scanner(System.in);
String str=s.next();
String str1=new StringBuffer(str).reverse().toString();
System.out.println(str1);
}
}

