import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int indX = scanner.nextInt();
    int indY = scanner.nextInt();
    int[][] m = new int[indX][indY];

    for (int i = 0; i < indX; i++) {
      for (int j = 0; j < indY; j++) {
        m[i][j] = scanner.nextInt();
      }
    }

    int max = Integer.MIN_VALUE;
    for (int j = 0; j < m.length; j++) {
      for (int i = 0; i < m[j].length; i++) {
        if (m[j][i] > max) {
          max = m[j][i];
          indX = j;
          indY = i;

        }
      }
    }

    System.out.println(indX + " " + indY);

  }

}
