import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int sum = 0;
    int num = 0;

    do
    {
      num = scan.nextInt();
      sum += num;
    } while (num != 0);

    System.out.print(sum);
  }
}