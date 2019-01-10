import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    if (in.nextInt() > 0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}