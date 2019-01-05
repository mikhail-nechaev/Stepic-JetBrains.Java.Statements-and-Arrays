import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int ready = 0;
    int fixed = 0;
    int rejects = 0;

    for (int i = 0; i < number; i++) {
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