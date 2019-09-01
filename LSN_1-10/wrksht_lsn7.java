import java.io.*;
import java.util.*;
public class wrksht_lsn7
{
  public static void main(String args[])
  {
    //CIRCLE PROJECT

    /*Scanner kbReader = new Scanner(System.in);
    System.out.print("What is the area? _");
    int area = kbReader.nextInt();
    double r = Math.sqrt((double)area / Math.PI);
    System.out.println("The radius of your circle is " + r);*/

    //FULL NAME PROJECT

    Scanner kbReader = new Scanner(System.in);
    System.out.println("What is your first name? _");
    String n1 = kbReader.nextLine();
    System.out.println("What is your last name? _");
    String n2 = kbReader.nextLine();
    System.out.println("Your full name is " + n1 + " " + n2 + ".");
  }
}
