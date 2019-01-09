import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char c=str.charAt(0);
        String s;
        int k=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) k++;
            else if (str.charAt(i) != c){
                System.out.print(c+""+k);
                c = str.charAt(i);
                k=1;
            }
        }System.out.println(c+""+k);
    }
}