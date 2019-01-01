import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count1 = scanner.nextInt();
            int count2 = scanner.nextInt();
            int[][] matrix = new int[count1][count2];
            for (int i = 0; i < count1; i++) {
                for (int j = 0; j < count2; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < count2; i++) {
                for (int j = 0; j < count1; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }
}