import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int A = scan.nextInt();
    int B = scan.nextInt();
    int H = scan.nextInt();

    if (H > B)
    {
      System.out.print("Excess");
    }
    else
    {
      if (H < A)
      {
        System.out.print("Deficiency");
      }
      else
      {
        System.out.print("Normal");
      }
    }
  }
}