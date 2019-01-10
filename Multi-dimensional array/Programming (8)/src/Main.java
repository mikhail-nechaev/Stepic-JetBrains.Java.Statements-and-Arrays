import java.util.Scanner;

public class Main {

  private int iMin;
  private int iMax;
  private int jMin;
  private int jMax;
  private String direction;
  private int i;
  private int j;

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

  private void run() {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] matrix = new int[n][n];

    iMin = 0;
    iMax = n-1;
    jMin = 0;
    jMax = n-1;
    direction = "right";
    i = 0;
    j = -1;

    for (int num = 1; num <= n*n; num++) {
      if (!(inIBounds(nextI()) && inJBounds(nextJ()))) {
        nextDirection();
      }
      nextPoint();
      matrix[i][j] = num;
    }

    for (int[] a: matrix) {
      for (int i: a) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  void nextDirection() {
    switch (direction) {
    case "right":
      iMin++;
      direction = "down";
      break;
    case "down":
      jMax--;
      direction = "left";
      break;
    case "left":
      iMax--;
      direction = "up";
      break;
    case "up":
      jMin++;
      direction = "right";
      break;
    }
  }

  int nextI() {
    if (direction.equals("down")) {
      return i+1;
    }
    if (direction.equals("up")) {
      return i-1;
    }
    return i;
  }

  int nextJ() {
    if (direction.equals("right")) {
      return j+1;
    }
    if (direction.equals("left")) {
      return j-1;
    }
    return j;
  }

  boolean inIBounds(int i) {
    return i >= iMin && i <= iMax;
  }

  boolean inJBounds(int j) {
    return j >=jMin && j <=jMax;
  }

  void nextPoint() {
    i = nextI();
    j = nextJ();
  }
}
