import java.io.*;
import java.util.*;
class alp
{
public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    String n=s.nextLine();
    String a="abcdefghijklmnopqrstuvwxyz";
    String b="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int l=a.length();
    
      if((a.contains(n))||(b.contains(n)))
        {
        System.out.print("alphabet");
         }
        else
        {
        System.out.print("invalid");
        }
 
