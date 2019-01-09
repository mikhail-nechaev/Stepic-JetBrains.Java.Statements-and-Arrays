import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        char[][] m = new char[s][s];
        for (int i = 0; i < s; i++) for (int k = 0; k < s; k++)m[i][k]='.';
        for (int i = 0; i < s; i++) for (int k = 0; k < s; k++){
            if (i==k) {m[i][k] = '*'; m[i][Math.abs(i-s+1)] = '*';}
            else if (i == Math.abs(s-1-i)) m[i][k] = '*';
            else if (k == Math.abs(s-1-k)) m[i][k] = '*';
        }

        for (int i = 0; i < s; i++){
            for (int k = 0; k < s; k++) System.out.print(m[i][k]+" ");
            System.out.println();
        }
    }
}