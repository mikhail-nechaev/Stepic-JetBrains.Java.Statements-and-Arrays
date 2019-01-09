import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] m = new int[n];
        for (int i = 1; i < n; i++) m[i] = scan.nextInt();
        m[0] = scan.nextInt();
        for (int i = 0; i< n-1; i++) System.out.print(m[i]+" ");
        System.out.println(m[n-1]);

    }
}