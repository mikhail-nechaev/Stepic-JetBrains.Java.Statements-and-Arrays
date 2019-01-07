import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      for (int i = 0; i < count; i++) {
        int in = scanner.nextInt();
        switch (in) {
          case 2:
            d ++;
            break;
          case 3:
            c ++;
            break;
          case 4:
            b ++;
            break;
          case 5:
            a ++;
            break;
        }
      }
      System.out.print(d + " " + c + " " + b + " " + a);
    }
  }
}