import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int count = 0, max = 0;
    while(count<n) {
      count++;
      int tmp = in.nextInt();
      if (tmp % 4 == 0 && tmp > max) max = tmp;
    }
    System.out.println(max);
  }
}