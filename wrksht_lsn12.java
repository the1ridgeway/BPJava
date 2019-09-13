import java.util.*;
import java.io.*;
public class wrksht_lsn12
{
  public static void main(String args[])
  {
    Scanner kb = new Scanner(System.in);
    int usr;
    do {
      System.out.println("Enter your integer:_");
      usr = kb.nextInt();
      System.out.println(usr + " squared is " + (usr * usr));
    } while (usr != 0);
  }
}
