import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int n = scan.nextInt();
            if (n == 0) break;
            if (n%2==0) System.out.println("even");
            if (n%2!=0) System.out.println("odd");
        }
    }
}