import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = 1;
    int n = scanner.nextInt();
    while (i * i <= n) {
      System.out.println(i * i);
      i++;
    }
  }
}