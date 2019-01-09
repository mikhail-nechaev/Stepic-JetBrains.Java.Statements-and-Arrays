import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] s = new int[n][m];
        for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) s[i][j]= scan.nextInt();
        int k = scan.nextInt();
        int b=0;
        jop:   for (int i = 0; i < n; i++)
        {
            int l=0;
            for (int j = 0; j < m; j++) {
                if (s[i][j] == 0) l++; else l = 0;
                if (l == k) {
                    b=i+1;
                    break jop;
                }
            }
        }
        System.out.println(b);
    }
}