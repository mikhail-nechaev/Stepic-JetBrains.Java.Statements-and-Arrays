import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] m= new int[n];
        for (int i=0;i<n;i++) m[i]=scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean k=false;
        for (int i=1;i<n;i++) if ((m[i-1] == a && m[i] ==b )||(m[i-1] == b && m[i] ==a)) k=true;
        System.out.println(k);
    }
}