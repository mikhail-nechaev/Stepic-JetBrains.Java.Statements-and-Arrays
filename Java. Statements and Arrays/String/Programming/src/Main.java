import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int f=0,s=0;
        for (int i = 0; i < 3; i++) f= f + Integer.parseInt( str.substring(i,i+1)) ;
        for (int i = 3; i < 6; i++) s= s + Integer.parseInt( str.substring(i,i+1)) ;
        if (f == s) System.out.println("Lucky");
        else System.out.println("Regular");

    }
}