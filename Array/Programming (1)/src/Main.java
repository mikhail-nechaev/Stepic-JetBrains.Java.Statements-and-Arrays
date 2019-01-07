import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int[] arr = new int[amount];
    int index = 0;
    int max = 0;
    for (int i=0; i<amount; i++) {
      arr[i] = sc.nextInt();
      if (arr[i]>max) {
        max = arr[i];
        index = i;
      }
    }
    System.out.println(index);
  }
}