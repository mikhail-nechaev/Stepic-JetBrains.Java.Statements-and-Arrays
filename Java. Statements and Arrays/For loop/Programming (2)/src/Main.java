import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int max=0;
    for (int i = 0;i<n;i++){
      int tmp = in.nextInt();
      if (tmp % 4 == 0 && tmp> max) max=tmp;
    }
    System.out.println(max);
  }
}