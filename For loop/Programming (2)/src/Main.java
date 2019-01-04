import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int max = 0;
    int curr;

    for (int i = 0; i < c; i++) {
      curr = scanner.nextInt();
      if (curr%4==0){
        max = Math.max(max, curr);
      }
    }

    System.out.println(max);

  }
}