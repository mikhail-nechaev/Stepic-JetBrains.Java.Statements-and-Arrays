import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int c = scan.nextInt();
        int[][] m = new int[s][c];      
        for (int i = 0; i < s; i++){
            for (int k = 0; k < c; k++) m[i][k] = scan.nextInt();
        }
        int max=m[0][0], ms =0, mc =0;
        for (int i = 0; i < s; i++) {
            for (int k = 0; k < c; k++) {
                if (m[i][k] > max){
                    max = m[i][k];
                    ms =i; mc =k;
                }
            }
        }
        System.out.println(ms+" "+mc);
    }
}