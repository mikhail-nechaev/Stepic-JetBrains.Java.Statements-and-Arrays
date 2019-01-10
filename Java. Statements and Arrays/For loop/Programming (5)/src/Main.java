import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a=0, b=0,c=0, d=0;
    for (int i = 0;i<n;i++)
    {
      int tmp = in.nextInt();
      if(tmp==2) a++;
      if(tmp==3) b++;
      if(tmp==4) c++;
      if(tmp==5) d++;
    }   System.out.println(a + " " + b + " " + c + " " +d);
  }
}