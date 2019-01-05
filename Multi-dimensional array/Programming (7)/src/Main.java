import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            int k = scanner.nextInt();


            boolean iCan = false;
            int row = 0;

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 0) {
                        count++;
                        if (k == count){
                            row = ++i;
                            iCan = true;
                            break;
                        }
                    } else {
                        count = 0;
                    }
                }
                if (iCan){
                    break;
                }
            }

            System.out.println(row);
        }
    }
}