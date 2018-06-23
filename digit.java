import java.io.*;
import java.util.*;
class digit
{
public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int cnt=0;
   while(n!=0)
    {
        n/=10;
        ++cnt;
	}
	System.out.print(cnt);
   }
}
