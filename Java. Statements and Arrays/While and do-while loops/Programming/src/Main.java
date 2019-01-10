import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int tmp = 0;
    while(in.nextInt()!=0) tmp++;
    System.out.println(tmp);
  }
}