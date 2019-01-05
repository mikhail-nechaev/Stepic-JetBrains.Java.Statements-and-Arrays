import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int A = 0, B = 0, C = 0, D = 0;
    for (; n > 0; n--) {
      int num = scanner.nextInt();
      if (num == 5) {
        D++;
      } else if (num == 4) {
        C++;
      } else if (num == 3) {
        B++;
      } else if (num == 2) A++;
    }
    System.out.println(A + " " + B + " " + C + " " + D);
  }
}