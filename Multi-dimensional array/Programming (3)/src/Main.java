import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int matrixSize = scanner.nextInt();
      for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
          System.out.print((Math.abs(i - j)) + " ");
        }
        System.out.println();
      }
    }
  }
}