import java.io.*;
import java.util.*;
class sum1
{
public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int k=s.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=s.nextInt();
   }
   int d=0;
   for(int i=0;i<k;i++)
    {
        d+=a[i];
	}
	System.out.print(d);
   }
}
