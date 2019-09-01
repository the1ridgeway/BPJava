import java.io.*;
import java.util.*;
public class wrksht_lsn10
{
  public static void main(String args[])
  {
    //worksheet problems

    /*String s = "X";
    char chr = 's';
    System.out.println(s);*/

    //weight project

    System.out.println("What is your weight on earth??\n");

    Scanner kbReader = new Scanner(System.in);
    double weight = kbReader.nextDouble();

    System.out.println("1. Voltar");
    System.out.println("2. Krypton");
    System.out.println("3. Fertos");
    System.out.println("4. Servontos\n");

    System.out.print("Selection? ");

    int choice = kbReader.nextInt();
    switch (choice)
    {
      case 1:
        System.out.println("Your weight on Voltar would be: " + (weight * 0.091) );
        break;
      case 2:
        System.out.println("Your weight on Krypton would be: " + (weight * 0.720) );
        break;
      case 3:
        System.out.println("Your weight on Fertos would be: " + (weight * 0.865) );
        break;
      case 4:
        System.out.println("Your weight on Servontos would be: " + (weight * 4.612) );
        break;
      default:
        System.out.println("Enter a selection next time. ");
    }
  }
}
