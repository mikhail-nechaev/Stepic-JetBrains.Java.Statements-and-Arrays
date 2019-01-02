import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int ready = 0, fixed = 0, rejects = 0;

    for (int i = scanner.nextInt(); i >0; i--) {
      switch (scanner.nextInt()) {
        case 0:
          ready++;
          break;
        case 1:
          fixed++;
          break;
        case -1:
          rejects++;
          break;
      }
    }

    System.out.println(ready + " " + fixed + " " + rejects);
  }
}