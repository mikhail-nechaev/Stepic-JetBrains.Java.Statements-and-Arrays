import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int a=0, b=0;
    while(n>a){
      b++;
      int i=0;
      while (n>a && b>i){
        i++;a++;
        System.out.print(b + " ");
      }
    }
    System.out.println();
  }
}