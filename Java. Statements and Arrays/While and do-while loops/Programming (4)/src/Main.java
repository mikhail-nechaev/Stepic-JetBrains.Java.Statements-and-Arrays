import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    long m= in.nextLong();
    long a=1, b=1;
    while(m>=b){
      a++;
      b *= a;}
    System.out.println(a);
  }
}