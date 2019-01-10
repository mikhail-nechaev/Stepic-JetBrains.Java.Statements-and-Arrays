import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (true){
      int tmp = in.nextInt();
      if (tmp == 0) break;
      if (tmp%2 ==0) System.out.println("even");
      if (tmp%2!=0) System.out.println("odd");
    }
  }
}