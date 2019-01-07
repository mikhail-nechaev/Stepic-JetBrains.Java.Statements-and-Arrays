import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int amount = sc.nextInt();
    int counter = 0;
    int max = 0;
    int [] arr = new int[amount];
    while (counter < amount) {
      arr[counter] = sc.nextInt();
      if ((arr[counter]>max) && (arr[counter] % 4 == 0))
        max = arr[counter];
      counter++;
    }
    System.out.println(max);
  }
}