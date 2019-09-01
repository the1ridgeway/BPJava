import java.io.*;
import java.util.*;
public class wrksht_lsn8_9
{
  public static void main(String args[])
  {
    Scanner kbReader = new Scanner(System.in);
    System.out.println("Enter an integer:_");
    int w = kbReader.nextInt();
    if (w % 2 == 0)
      System.out.println("The integer " + w + " is even.");
    else
      System.out.println("The integer " + w + " is odd.");
  }
}
