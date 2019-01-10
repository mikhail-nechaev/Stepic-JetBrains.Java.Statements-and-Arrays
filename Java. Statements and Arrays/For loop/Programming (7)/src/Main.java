import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a=0, b=0, c=0;
    for (int i = 0;i<n;i++)
    {
      int tmp = in.nextInt();
      if (tmp == 0) a++;else if (tmp == 1) b++;else c++;
    }System.out.println(a+" "+b+" "+c);
  }
}