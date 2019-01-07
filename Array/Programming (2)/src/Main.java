import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    if (amount == 1)
      System.out.println(sc.nextInt());
    else {
      int[] arr = new int[amount];
      int maxpr = 1;
      for (int i = 0; i < amount; i++) {
        arr[i] = sc.nextInt();
      }
      for (int j=0; j<amount - 1; j++) {
        if ((arr[j] * arr[j+1]) > maxpr)
          maxpr = arr[j] * arr[j+1];
      }
      System.out.println(maxpr);
    }
  }
}