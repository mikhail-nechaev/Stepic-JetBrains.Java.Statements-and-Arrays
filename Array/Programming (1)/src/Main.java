import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int max = 0;
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }

    if (Arrays.stream(arr).max().isPresent()) {
      max = Arrays.stream(arr).max().getAsInt();
    }

    for (int i = 0; i < n; i++) {
      if (arr[i] == max) {
        System.out.println(i);
        break;
      }
    }
  }
}