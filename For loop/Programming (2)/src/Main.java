import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    int amount = sc.nextInt();
    for (int i=1; i<=amount; i++) {
      int cur = sc.nextInt();
      if ((cur % 4 == 0) && (cur > max)) {
        max = cur;
      }
    }
    System.out.println(max);
  }
}