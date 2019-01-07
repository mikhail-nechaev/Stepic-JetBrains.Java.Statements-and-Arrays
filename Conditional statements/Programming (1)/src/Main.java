import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();

    if (A + B > C && A + C > B && B + C > A)
    {
      System.out.print("YES");
    }
    else
    {
      System.out.print("NO");
    }

  }
}