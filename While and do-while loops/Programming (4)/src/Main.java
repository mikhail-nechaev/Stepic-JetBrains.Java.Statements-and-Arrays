import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long m =  scanner.nextLong();
    long x = 0;
    while (factorial(x) <= m) {
      x++;
    }
    System.out.println(x);
  }

  static long factorial(long l) {
    long answer = 1;
    for (int i = 2; i <= l; i++) {
      answer*=i;
    }
    return answer;
  }
}