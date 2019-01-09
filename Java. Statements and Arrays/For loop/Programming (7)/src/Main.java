import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a=0, b=0, c=0;
        for (int i = 0;i<n;i++)
        {
            int e = scan.nextInt();
            if (e == 0) a++;else if (e == 1) b++;else c++;
        }System.out.println(a+" "+b+" "+c);
    }
}
