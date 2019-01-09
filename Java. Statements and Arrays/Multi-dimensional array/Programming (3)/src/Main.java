import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print((Math.abs(i-j)) + " ");
            System.out.println();
        }
    }
}