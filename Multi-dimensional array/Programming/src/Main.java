import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int[][] matrix = new int[count][count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            System.out.println(isSymmetric(matrix) ? "YES" : "NO");
        }
    }

    private static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}