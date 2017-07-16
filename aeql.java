import java.io.*;
import java.util.*;
public class aeql
{
    public static void main(String args[])
    {   
        boolean flag=true;
        int[] a={1,2,3,4,5};
        int[] b={3,4,5};
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i]==b[j])
                {
                    flag=true;
                }
                else
                {
                    flag=false;
                }
            }
        }
        if(flag==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}

