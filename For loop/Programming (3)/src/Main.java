import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    for (int i=1; i<1000; i++)
      if (a*i*i*i+b*i*i+c*i+d == 0)
        System.out.println(i);
  }
}