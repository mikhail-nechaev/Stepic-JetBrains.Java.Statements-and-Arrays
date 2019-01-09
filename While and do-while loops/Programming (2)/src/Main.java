import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int next;
    while ((next = scanner.nextInt()) != 0) {
      sum+=next;
    }
    System.out.println(sum);
  }
}