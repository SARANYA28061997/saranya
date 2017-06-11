import java.io.*;
import java.util.*;
import java.util.Arrays;
public class SS
{
    public static void main(String args[])
    {   int i=0;
        int array[] = new int [20];
         Scanner scanner=new Scanner(System.in);

          for ( i=0; i<array.length; i++) 
          {
           array[i]=scanner.nextInt();
              
          }Arrays.sort(array);
        int k=scanner.nextInt();
        if(k>0)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(array[j]);
            }
        }

        
    }
}
