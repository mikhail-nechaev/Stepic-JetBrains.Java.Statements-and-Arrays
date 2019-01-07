import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      int ready = 0;
      int fixed = 0;
      int rejects = 0;
      for (int i = 0; i < count; i++) {
        int in = scanner.nextInt();
        switch (in) {
          case 0:
            ready ++;
            break;
          case 1:
            fixed ++;
            break;
          case -1:
            rejects ++;
            break;
        }
      }
      System.out.println(ready + " " + fixed + " " + rejects);
    }
  }
}