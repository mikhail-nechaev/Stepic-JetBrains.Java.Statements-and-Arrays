import java.util.Scanner;

public class Main {
//  public static long fact(int n) {
//    int counter = 1;
//    long f = 1;
//    while (counter < n) {
//      f = f * counter;
//    }
//    return f;
//  }

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    long m = sc.nextLong();
    long f = 1;
    int n = 1;
    while (f <= m) {
      f = f * n;
      n = n+1;
    }
    System.out.println(n-1);
  }
}