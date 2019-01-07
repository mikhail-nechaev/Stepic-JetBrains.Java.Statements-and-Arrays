import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nums = scan.nextInt();
    int curr = 0;

    int A = 0;
    int B = 0;
    int C = 0;
    int D = 0;

    for (int i = 0; i < nums; i++)
    {
      curr = scan.nextInt();
      switch (curr)
      {
        case 5: A++;
        break;
        case 4: B++;
        break;
        case 3: C++;
        break;
        case 2: D++;
        break;
      }
    }
    System.out.print(D + " " + C + " " + B + " " + A);
  }
}