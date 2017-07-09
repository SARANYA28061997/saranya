import java.io.*;
public class inti
{
    public static void main(String args[])
    {
        
        int[] a=new int[6];
        int[] b=new int[6];
        for(int i=1;i<6;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        int tn=Integer.parseInt(args[0]);
        for(int i=0;i<6;i++)
        {
            for(int j=i+1;j<6;j++)
            {    b[i]=a[i]+a[j];
                if(b[i]==tn)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
        
    }
}
