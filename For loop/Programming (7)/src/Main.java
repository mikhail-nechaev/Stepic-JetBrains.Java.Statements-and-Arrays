import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] parts = new int[3];
    int amount = scanner.nextInt();
    for (int i = 0; i < amount; i++) {
      int next = scanner.nextInt();
      switch (next) {
      case 0:
        parts[0]++;
        break;
      case 1:
        parts[1]++;
        break;
      case -1:
        parts[2]++;
        break;
      }
    }
    for (int i: parts) {
      System.out.print("" + i + " ");
    }
  }
}