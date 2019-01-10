import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int ready = 0, toBeFixed = 0, rejects = 0;
      for (int i = 0;i<n;i++)
      {
        int element = scanner.nextInt();

        if (element == 0) {
          ready++;
        } else if (element == 1) {
          toBeFixed++;
        } else {
          rejects++;
        }
      }System.out.println(ready + " " + toBeFixed + " " + rejects);
    }
  }
}