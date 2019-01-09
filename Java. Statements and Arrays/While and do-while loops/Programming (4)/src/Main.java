import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
        long q=1,f=1;
        while(n>=f){ q++; f=f*q;} 
        System.out.println(q);
    }
}
