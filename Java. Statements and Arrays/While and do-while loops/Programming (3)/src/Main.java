import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n= in.nextInt();
    int sqr=1;
    do {System.out.println(sqr*sqr);sqr++;} while(n>=sqr*sqr);
  }
}