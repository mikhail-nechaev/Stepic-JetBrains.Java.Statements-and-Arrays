import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int in = scanner.nextInt();
    if (((in % 4 == 0) && (in % 100 != 0)) || (in % 400 == 0))
      System.out.println("Leap");
    else System.out.println("Regular");
  }
}