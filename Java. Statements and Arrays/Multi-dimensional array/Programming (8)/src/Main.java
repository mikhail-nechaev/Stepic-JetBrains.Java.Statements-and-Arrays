import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] s = new int[n][n];
        int x = 0, y = 0, dx = 1, dy = 0;
        int d = 0,t=0, k = n-1;
        for (int i = 1; i <= n*n; i++) {
            if (k == 0) { t = dx;dx = -dy;dy = t;k = n*(d%2)+n*((d+1)%2)-d/2-1;d++; }
            s[y][x] = i;
            x=x+dx;y=y+dy; k--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(s[i][j]+" ");
            System.out.println();
        }
    }
}