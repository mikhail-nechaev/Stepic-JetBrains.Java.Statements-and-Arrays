import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int[] arr = new int[amount];
    for (int i = 0; i < amount; i++) {
      arr[i] = sc.nextInt();
    }
    int finish = arr[arr.length-1];
    int[] newarr = new int[amount];
    for (int j=1; j<amount; ++j) {
      newarr[j] = arr[j-1];
    }
    newarr[0] = finish;
    for (int i = 0; i<amount; i++)
      System.out.print(newarr[i]+" ");
  }
}