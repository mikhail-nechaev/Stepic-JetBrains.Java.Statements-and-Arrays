import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int e = scan.nextInt();
        float s=0, c=0;
        for (int i = b;i<=e;i++) if (i%3 == 0 ){s=s+i;c++;}
        System.out.println(s/c);
    }
}