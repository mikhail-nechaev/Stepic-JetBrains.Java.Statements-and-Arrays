import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    float res = 0;
    int sum = 0;
    float counter = 0.0f;
    for (int i=a; i<=b; i++) {
      if (i % 3 == 0) {
        sum = sum+i;
        counter++;
      }
    }
    res = sum/counter;
    System.out.println(res);
  }
}