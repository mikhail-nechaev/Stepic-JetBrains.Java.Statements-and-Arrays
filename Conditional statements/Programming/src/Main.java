import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    if (num > 0)
    {
      System.out.print("YES");
    }
    else
    {
      System.out.print("NO");
    }
  }
}