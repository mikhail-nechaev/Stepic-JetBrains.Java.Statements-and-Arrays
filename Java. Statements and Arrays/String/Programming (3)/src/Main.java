import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String s = str.toLowerCase();
        String [] m = s.split("");
        double c=0.0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].equals("g") || m[i].equals("c")  ) c++;
        }
        System.out.println(c/str.length()*100.0);

    }
}