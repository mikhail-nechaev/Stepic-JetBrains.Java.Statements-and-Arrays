import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nums = scan.nextInt();
    int curr = 0;

    int A = 0;
    int B = 0;
    int C = 0;

    for (int i = 0; i < nums; i++)
    {
      curr = scan.nextInt();
      switch (curr)
      {
        case -1: A++;
          break;
        case 1: B++;
          break;
        case 0: C++;
          break;
      }
    }
    System.out.print(C + " " + B + " " + A);
  }
}