import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals("end")) return;
        String[] r = str.split(" +");
        int n= r.length;
        int [][] m =new int[1000][n];
        for (int i=0;i< n;i++) m[0][i]= Integer.parseInt(r[i]);
        int k=1;
        while (true) {
            str = scan.nextLine();
            if (str.equals("end")) break;
            r = str.split(" +");
            for (int i=0;i< n;i++)m[k][i]= Integer.parseInt(r[i]);
            k++;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                 int ii = i-1;if (ii < 0) ii=k-1;
                 int ij= i+1;if (ij > k-1) ij =0;
                 int ji = j-1;if (ji < 0) ji=n-1;
                 int jj= j+1;if (jj > n-1) jj =0;
                 int p=(m[ii][j] + m[ij][j] + m[i][ji] +m[i][jj]);
                 System.out.print(p);
                 if (j !=n-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}