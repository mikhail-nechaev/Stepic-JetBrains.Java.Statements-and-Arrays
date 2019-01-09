import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int n = scan.nextInt();
    if((n>-15 && n<= 12) || (n> 14 && n< 17)||(n>=19)) System.out.print("True");
    else System.out.print("False");
  }
}