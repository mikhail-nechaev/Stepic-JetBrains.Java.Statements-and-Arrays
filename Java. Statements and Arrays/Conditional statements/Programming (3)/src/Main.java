import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    String s = String.format("%04d", n);
    if ((s.charAt(0) == s.charAt(3)) && (s.charAt(1) == s.charAt(2))) System.out.println(1);
    else System.out.println(10);
  }
}