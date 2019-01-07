import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    long value = scan.nextLong();
    int cnt = 0;
    long f;
    do {
      cnt++;
      f = 1;
      int i = 1;
      while (i < cnt)
      {
        f *= i;
        ++i;
      }
    } while (f <= value);
    System.out.println(--cnt);
  }
}