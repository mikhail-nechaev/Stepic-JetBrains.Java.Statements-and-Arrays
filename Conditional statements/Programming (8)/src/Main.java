import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int units = sc.nextInt();
    if(units<1)
      System.out.println("no army");
    else if (units <= 4)
      System.out.println("few");
    else if (units <= 9)
      System.out.println("several");
    else if (units <= 19)
      System.out.println("pack");
    else if (units <= 49)
      System.out.println("lots");
    else if (units <= 99)
      System.out.println("horde");
    else if (units <= 249)
      System.out.println("throng");
    else if (units <= 499)
      System.out.println("swarm");
    else if (units <= 999)
      System.out.println("zounds");
    else
      System.out.println("legion");

  }
}