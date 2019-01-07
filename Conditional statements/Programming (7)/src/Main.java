import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int M = scan.nextInt();
    int K = scan.nextInt();

    if ((K % N == 0 || K % M == 0) && K < N * M)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}