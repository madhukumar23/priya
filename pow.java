import java.io.*;
import java.util.*;
class pow
{
public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int k=s.nextInt();
   int m=0;
   if((n!=0)&&(k!=0))
    {
    m=(int)Math.pow(n,k);
	}
	System.out.print(m);
   }
}
