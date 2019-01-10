import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 1; i < n; i++) arr[i] = in.nextInt();
    arr[0] = in.nextInt();
    for (int i = 0; i< n-1; i++) System.out.print(arr[i]+" ");
    System.out.println(arr[n-1]);
  }
}