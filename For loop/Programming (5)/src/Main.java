import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfMarks = scanner.nextInt();
      int as = 0, bs = 0, cs = 0, ds = 0;

      for (int i = 0; i < numOfMarks; i++) {
        int mark = scanner.nextInt();
        switch (mark) {
          case 2:
            ds++;
            break;
          case 3:
            cs++;
            break;
          case 4:
            bs++;
            break;
          case 5:
            as++;
            break;
            default:
              break;
        }
      }

      System.out.println(ds + " "+ cs + " " + bs + " " + as);
    }
  }
}