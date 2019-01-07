import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cur = sc.nextInt();
    while(cur != 0) {
      if (cur % 2 == 0)
        System.out.println("even");
      else System.out.println("odd");
      cur = sc.nextInt();
    }
  }
}