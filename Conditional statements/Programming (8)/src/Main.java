import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int members = scan.nextInt();

    if (members < 1)
    {
      System.out.print("no army");
    }
    if (members >= 1 && members <= 4)
    {
      System.out.print("few");
    }
    if (members >= 5 && members <= 9)
    {
      System.out.print("several");
    }
    if (members >= 10 && members <= 19)
    {
      System.out.print("pack");
    }
    if (members >= 20 && members <= 49)
    {
      System.out.print("lots");
    }
    if (members >= 50 && members <= 99)
    {
      System.out.print("horde");
    }
    if (members >= 100 && members <= 249)
    {
      System.out.print("throng");
    }
    if (members >= 250 && members <= 499)
    {
      System.out.print("swarm");
    }
    if (members >= 500 && members <= 999)
    {
      System.out.print("zounds");
    }
    if (members >= 1000)
    {
      System.out.print("legion");
    }
  }
}