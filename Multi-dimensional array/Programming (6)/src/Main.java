import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            char[][] matrix = new char[count][count];
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    matrix[i][j] = '.';
                }
            }
            for (int i = 0; i < count; i++) {
                matrix[count / 2][i] = '*';
                matrix[i][count / 2] = '*';
                matrix[i][i] = '*';
                matrix[i][count - i - 1] = '*';
            }
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}