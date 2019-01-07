import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int students = sc.nextInt();
    int ds = 0;
    int cs = 0;
    int bs = 0;
    int as = 0;
    for (int i=0; i<students; i++) {
      String cur = sc.next();
      if (cur.equals("2"))
        ds++;
      else if (cur.equals("3"))
        cs++;
      else if (cur.equals("4"))
        bs++;
      else if (cur.equals("5"))
        as++;
    }
    System.out.print(ds+" "+ cs + " "+ bs+ " "+ as);
  }
}