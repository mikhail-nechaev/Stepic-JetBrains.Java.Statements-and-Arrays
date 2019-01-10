import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = in.nextInt();
    int max = 0;
    int last = arr[0];
    if (arr.length == 1){
      System.out.println(arr[0]);
      return;
    }
    for (int i = 1; i< n; i++){
      int now = arr[i];
      int mult=now*last;
      if (mult>max) max=mult;
      last = now;
    }System.out.println(max);

  }
}