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
            int seats = scanner.nextInt();
            System.out.println(findRow(matrix, seats));
        }
    }

    private static int findRow(int[][] matrix, int seats) {
        for (int i = 0; i < matrix.length; i++) {
            int streak = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    streak = 0;
                } else {
                    streak++;
                    if (streak == seats) {
                        return i + 1;
                    }
                }
            }
        }
        return 0;
    }
}