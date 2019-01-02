import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();
    boolean flag = false;
    if (year % 4 == 0) flag = true;

    if (year % 100 == 0) flag = false;

    if (year % 400 == 0) flag = true;

    if (flag) System.out.println("Leap");
    else System.out.println("Regular");
  }
}