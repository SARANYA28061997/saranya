import java.io.*;
import java.util.*;
public class RPTN
{
public static void main(String args[])
{
int[] a=new int[11];
for(int i=0;i<11;i++)
{
a[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<11;i++)
{ 
    for(int j=i+1;j<11;j++)
    {
    if(a[i]==a[j])
    {
        a[i]=0;
    a[j]=0;
    }
    }
}
for(int i=0;i<11;i++)
{
    if(a[i]!=0)
    System.out.println(a[i]);
}
}
}
