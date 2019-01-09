import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int i = 0;
    int counter;
    while (x > 0) {
      i++;
      counter = 0;
      while (x > 0 && counter < i) {
        x--;
        counter++;
        System.out.println(i);
      }
    }
  }
}