import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    float s=0, f=0;
    for (int i = a;i<=b;i++)
      if (i%3 == 0 ) {
        s+=i;
        f++;
    }
    System.out.println(s/f);
  }
}