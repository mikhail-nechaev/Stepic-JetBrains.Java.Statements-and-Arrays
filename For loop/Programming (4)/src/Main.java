import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int counter = 0;
    int sum = 0;
    for (int i = a; i <=b; i++) {
      if (i % 3 == 0) {
        counter++;
        sum+=i;
      }
    }
    System.out.println((double) sum/counter);
  }
}