import java.io.*;
import java.util.*;
class sum
{
public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int i=1;
   int su=0;
    while(i<=n)
    {
        su=su+i;
        i++;
	}
	System.out.print(su);
   }
}
