import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        for (int x = 0;x<=1000;x++) {
            if (a*x*x*x+b*x*x+c*x+d==0) {
                System.out.println(x);
            }
        }
    }
}
