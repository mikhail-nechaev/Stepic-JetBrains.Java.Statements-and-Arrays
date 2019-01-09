import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) m[i] = scan.nextInt();
        int k = 0;
        int l = m[0];
        if (m.length == 1){
            System.out.println(m[0]);
            return;
        }
        for (int i = 1; i< n; i++){
            int y = m[i];
            int p=y*l;
            if (p>k)k=p;
            l=y;
        }System.out.println(k);

    }
}