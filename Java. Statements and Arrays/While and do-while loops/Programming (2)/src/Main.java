import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int sum = 0, n;
    while(( n= in.nextInt()) != 0 ) sum+=n;
    System.out.println(sum);
  }
}