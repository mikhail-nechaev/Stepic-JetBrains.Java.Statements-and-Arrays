import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    double sum = 0;
    int count = 0;

    for (;a <= b; a++)
    {
      if (a % 3 == 0)
      {
        sum += a;
        ++count;
      }
    }
    double rez = sum / count;
    System.out.print(rez);
  }
}