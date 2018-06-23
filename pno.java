import java.io.*;
import java.util.*;
class pnz
{
public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n>0)
    {
        System.out.print("positive");
    }
    if(n<0)
    {
        System.out.print("negative");
    }
    if(n==0)
   {
    System.out.print("zero");
   }
 }
}
