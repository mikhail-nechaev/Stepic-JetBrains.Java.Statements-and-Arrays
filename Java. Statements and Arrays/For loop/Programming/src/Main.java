import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        for (long i = a+1;i<=b;i++) a=a+i;
        System.out.println(a);
    }
}