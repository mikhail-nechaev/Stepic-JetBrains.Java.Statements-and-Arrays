import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();
    int a = year % 10;
    year/=10;
    int b = year % 10;
    year/=10;
    int c = year % 10;
    year/=10;
    int d = year % 10;
    year/=10;
    if (a == d && b == c) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}