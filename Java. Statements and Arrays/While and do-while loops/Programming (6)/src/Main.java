import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        System.out.print(n + " ");
        while (n > 1) {
            if (n % 2 != 0) n = n * 3 + 1;
            else n = n / 2;
            System.out.print(n + " ");
        }
        System.out.println();
    }
}