import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        if (k> m*n) System.out.println("NO");
        else if ((k%n == m || k%m == n || k%n == 0 || k%m == 0)) System.out.println("YES");
        else System.out.println("NO");
    }
}