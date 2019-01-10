import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    for (int i = a+1;i<=b;i++) a+=i;
    System.out.println(a);
  }
}