import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
   {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int flag=0;
     if (n%4==0) 
			{
			    if(n%100==0)
			    {
			       if(n%400==0)
			       {
				  flag=1;
			       }
			       else
			       {
			           flag=0;
			       }
			     }
			     else
			     {
			     flag=1;
			     }
			 }
			else
			{
				flag=0;
			}
			if(flag==1)
			{
			    System.out.print("yes");
			}
