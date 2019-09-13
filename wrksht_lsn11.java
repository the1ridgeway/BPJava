import java.io.*;
import java.util.*;
public class wrksht_lsn11
{
  public static void main(String args[])
  {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter your name._");
    String name = kb.nextLine();
    int a, g, len = name.length();
    for(g = 0;g < len;g++)
    {
      for(a = len;a > 0;a--)
      {
        len--;
        String eman = name.substring(len, a);
        System.out.print(eman);
      }
    }
    System.out.println();
  }
}
