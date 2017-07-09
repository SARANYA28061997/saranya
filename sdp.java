import java.io.*;
import java.util.*;
public class sdp
{
    public static void main(String a[])
    {
        int n=Integer.parseInt(a[0]);
        int p,sum=0;
        while(n>0)
        {
        p=n%10;
        sum=sum+p;
        n=n/10;
        }
        System.out.println(sum);
        int n1=0;
        int sum1;
        sum1=sum;
        while(sum1>0)
        {
            int r=sum1%10;
            n1=n1*10+r;
            sum1=sum1/10;
        }
        if(sum==n1)
        {
            System.out.println("palindrome");
            
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
