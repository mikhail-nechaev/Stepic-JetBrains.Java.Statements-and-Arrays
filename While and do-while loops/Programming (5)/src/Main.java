import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      int i = 1;
      int j = 1;
      while (count != 0) {
        while (j != 0) {
          System.out.print(i + " ");
          j--;
          count--;
          if (count == 0) break;
        }
        i++;
        j = i;
      }
    }
  }
}