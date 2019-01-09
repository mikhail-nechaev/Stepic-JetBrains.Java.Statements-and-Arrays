import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long s=0;
        for (long i = 0;i<a;i++){
            long n = scan.nextLong();
            if (n % 4 == 0 && n> s) s=n;
        }
        System.out.println(s);
    }
}