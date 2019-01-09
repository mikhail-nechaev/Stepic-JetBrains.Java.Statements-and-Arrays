import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                m[i][k] = scan.nextInt();
            }
        }
        boolean f=true;
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n; k++) if (m[i][k] != m[k][i]) f=false;
        }
        System.out.println(f? "YES" : "NO");
    }
}