import java.io.*;
import java.util.*;
public class wrksht_lsn14
{
  public static void main(String args[])
  {
    //<Base> to <base>
    String s = Integer.toString(Integer.parseInt("9322GF",33), 28);
    System.out.println(s);

    //<base> to decimal
    /*Scanner in = new Scanner(System.in);

    System.out.println("What base are we using? Enter from 2 to 36:");
    int b = in.nextInt();

    System.out.println("Enter your number in base form:");
    String s = in.next();

    int i = Integer.parseInt(s,b);
    System.out.println(i);*/

    //BASES TABLE PROJECT
    /*System.out.println("This is a table of bases:");
    System.out.println("Decimal     Binary     Octal     Hex     Character");
    for(int j = 65;j <= 90; j++)//five spaces between outputs
      {
        System.out.print(j + "          ");
        System.out.print(Integer.toBinaryString(j) + "    ");
        System.out.print(Integer.toOctalString(j) + "       ");
        System.out.print(Integer.toHexString(j) + "      ");
        char ch = (char)j;
        System.out.println(ch);
      }*/
  }
}
