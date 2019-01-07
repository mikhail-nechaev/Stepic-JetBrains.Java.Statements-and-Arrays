import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int cur = 1;
    while ((cur * cur) <= n) {
      System.out.println(cur * cur);
      cur = cur + 1;
    }
  }
}