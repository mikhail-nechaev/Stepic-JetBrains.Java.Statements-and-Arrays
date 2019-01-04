import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++){
      arr[i] = scanner.nextInt();
    }

    int max = 0;

    if (size == 1){
      System.out.println(arr[0]);
      return;
    }

    for (int i = 0; i < size - 1; i++){
      for (int j = i + 1; j < size; j++){
        max = Math.max(max, arr[i]*arr[j]);
      }
    }

    System.out.println(max);

  }

}