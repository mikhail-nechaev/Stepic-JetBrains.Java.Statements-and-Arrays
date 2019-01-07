import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int amount = sc.nextInt();
    for (int i=1; i<=amount; i++) {
      int cur = sc.nextInt();
      if (cur % 6 == 0) {
        sum = sum + cur;
      }
    }
    System.out.println(sum);
  }
}