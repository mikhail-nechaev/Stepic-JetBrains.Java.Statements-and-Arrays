import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            boolean isSymmetric = true;

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != a[j][i]){
                        isSymmetric = false;
                        break;
                    }
                }
                if (!isSymmetric){
                    break;
                }
            }

            System.out.println(isSymmetric ? "YES" : "NO");
        }
    }
}