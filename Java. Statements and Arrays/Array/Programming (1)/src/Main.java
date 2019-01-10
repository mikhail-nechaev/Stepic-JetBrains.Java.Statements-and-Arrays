import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int len = in.nextInt();
    int[] array = new int[len];

    for (int i = 0; i < len; i++) {
      array[i] = in.nextInt();
    }

    int max = array[0];
    int ind = 0;

    for (int i = 1; i< len; i++){
      ind = array[i] > max ? i : ind;
      max = array[i] > max ? array[i] : max;

    }

    System.out.println(ind);
  }
}