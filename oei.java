import java.io.*;
import java.util.*;
class oei
{
public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    if(n>0)
    {
        if(n%2==1)
        {
        System.out.print("odd");
         }
        else
        {
        System.out.print("even");
         }
    }
     else
      {
    System.out.print("invalid");
     }
  }
}
