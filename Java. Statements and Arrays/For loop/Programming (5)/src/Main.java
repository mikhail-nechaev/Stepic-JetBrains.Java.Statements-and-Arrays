import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a=0, b=0,c=0, d=0;
        for (int i = 0;i<n;i++)
        {
            int k = scan.nextInt();
            if(k==2) a++;
            if(k==3) b++;
            if(k==4) c++;
            if(k==5) d++;
        }   System.out.println(a + " " + b + " " + c + " " +d);
    }
}