import java.io.*;
import java.util.*;
public class V
{
public static void main(String args[])
{
char[] vol={'a','e','i','o','u'};
Scanner s=new Scanner(System.in);
char l=s.next();
int n=vol.length();
for(int i=0;i<n-1;i++)
{
if(l==vol[i])
{
System.out.println("vowel");
}
else
{
Syste.out.println("consonant");
}
}
}
}
