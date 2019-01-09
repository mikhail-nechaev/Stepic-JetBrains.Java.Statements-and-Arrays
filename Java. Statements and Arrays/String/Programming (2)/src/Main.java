import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String  s= "";
        int m =0,k = str.length()-1 ;
        for (int i = 0; i < str.length(); i++) {s=s + str.charAt(k);k--;}
        if (str.equals(s) ) System.out.println("yes");
        else System.out.println("no");
    }
}
