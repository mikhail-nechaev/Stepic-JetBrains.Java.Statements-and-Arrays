import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int q=1;
        do {System.out.println(q*q);q++;} while(n>=q*q);
    }
}