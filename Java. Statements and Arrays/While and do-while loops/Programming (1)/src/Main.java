import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0, m = 0;
        while(c<n) {
            c++;
            int a = scan.nextInt();
            if (a % 4 == 0 && a > m) m = a;
        }
        System.out.println(m);
    }
}