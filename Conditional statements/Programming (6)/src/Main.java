import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int healthy = scanner.nextInt();
      int oversleepEdge = scanner.nextInt();
      int AnnSleeps = scanner.nextInt();

      if (AnnSleeps > oversleepEdge) {
        System.out.println("Excess");
      } else if (AnnSleeps <= oversleepEdge && AnnSleeps >= healthy) {
        System.out.println("Normal");
      } else if (AnnSleeps < healthy) {
        System.out.println("Deficiency");
      }
    }
  }
}