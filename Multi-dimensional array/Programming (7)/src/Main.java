import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();
      int[][] matrix = new int[rows][columns];
      int[] freeSeats = new int[rows];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }

      int numOfSeats = scanner.nextInt();
      int searchedRow = 0;
      boolean seatIsFound = false;

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          if (matrix[i][j] == 0) {
            freeSeats[i]++;
          } else {
            freeSeats[i] = 0;
          }
          if (freeSeats[i] == numOfSeats) {
            searchedRow = i + 1;
            seatIsFound = true;
            break;
          }
        }
        if (seatIsFound) break;
      }

      System.out.println(searchedRow);
    }
  }
}