import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i=0;i<n;i++) arr[i]=in.nextInt();
    int a = in.nextInt();
    int b = in.nextInt();
    boolean flag=false;
    for (int i=1;i<n;i++) if ((arr[i-1] == a && arr[i] ==b )||(arr[i-1] == b && arr[i] ==a)) flag=true;
    System.out.println(flag);
  }
}