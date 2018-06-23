import java.io.*;
import java.util.*;
class vow
{
public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    String n=s.nextLine();
    String a="aeiou";
    int l=a.length();
    
      if(a.contains(n))
        {
        System.out.print("vowel");
         }
        else
        {
        System.out.print("invalid");
        }
  }
}
