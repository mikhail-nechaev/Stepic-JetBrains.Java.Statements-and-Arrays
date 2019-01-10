import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    if(a<1) System.out.println("no army");
    else if (a <= 4) System.out.println("few");
    else if (a <= 9) System.out.println("several");
    else if (a <= 19) System.out.println("pack");
    else if (a <= 49) System.out.println("lots");
    else if (a <= 99) System.out.println("horde");
    else if (a <= 249) System.out.println("throng");
    else if (a <= 499) System.out.println("swarm");
    else if (a <= 999) System.out.println("zounds");
    else System.out.println("legion");
  }
}