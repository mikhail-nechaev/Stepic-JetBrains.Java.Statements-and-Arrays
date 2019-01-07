import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean res = false;
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int[] arr = new int[amount];
    for (int i=0; i<amount; i++) {
      arr[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    int m = sc.nextInt();
    for (int i = 0; i < amount; i++) {
      if ((arr[i]==n) || (arr[i]==m))  {
        if ((i<amount - 1) && ((arr[i+1]==m) || (arr[i+1]==n)))
          res = true;
      }
    }
    System.out.println(res);
  }
}