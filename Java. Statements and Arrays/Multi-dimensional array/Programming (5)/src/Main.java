import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int c = scan.nextInt();
        int[][] m = new int[s][c];
        int[][] t = new int[s][c];
        for (int i = 0; i < s; i++) for (int k = 0; k < c; k++) m[i][k] = scan.nextInt();
        int p = scan.nextInt();
        int d = scan.nextInt();
        for (int i = 0; i < s; i++) {
            int tmp = m[i][p];
            m[i][p] = m[i][d];
            m[i][d] = tmp;
        }
        for (int i = 0; i < s; i++){
            for (int k = 0; k < c; k++) System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}