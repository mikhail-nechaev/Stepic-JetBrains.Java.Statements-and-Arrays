import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s = 0, n=0;
        while(( n= scan.nextInt()) != 0 ) s=s+n;
        System.out.println(s);
    }
}
