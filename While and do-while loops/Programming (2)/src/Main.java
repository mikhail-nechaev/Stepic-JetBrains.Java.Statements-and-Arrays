import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int sum = 0;
    while (sc.hasNext()) {
      int cur = sc.nextInt();
      sum = sum + cur;
      if (cur == 0)
        break;
    }
    System.out.println(sum);
  }
}