import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
        int c=0, k=0;
        while(n>c){
            k++;
            int i=0;
            while (n>c && k>i){
                i++;c++;
                System.out.print(k + " ");
            }
        }
        System.out.println();
    }
}