import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] arr = input.split(" ");
    int max = 0;
    String res = "";
    for (int i=0; i<arr.length; i++) {
      if (arr[i].length() > max) {
        res = arr[i];
        max = arr[i].length();
      }
    }
    System.out.println(res);
  }
}