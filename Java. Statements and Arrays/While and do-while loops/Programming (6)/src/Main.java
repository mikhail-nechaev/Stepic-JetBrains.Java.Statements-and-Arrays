import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.print(n + " ");
    while (n > 1) {
      if (n % 2 != 0) n = n * 3 + 1;
      else n = n / 2;
      System.out.print(n + " ");
    }
    System.out.println();
  }
}