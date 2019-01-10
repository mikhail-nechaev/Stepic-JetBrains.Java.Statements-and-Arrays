import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    int a=0, b=0;
    char [] chars = str.toCharArray();
    for (int i = 0; i < 3; i++) a+= chars[i] - '0' ;
    for (int i = 3; i < 6; i++) b+= chars[i] - '0' ;
    if (a == b) System.out.println("Lucky");
    else System.out.println("Regular");
  }
}