import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int ready = 0;
    int tofix = 0;
    int rejects = 0;
    for (int i=0; i<amount; i++) {
      int cur = sc.nextInt();
      if (cur == 1)
        tofix++;
      else if (cur == -1)
        rejects++;
      else if (cur == 0)
        ready++;
    }
    System.out.print(ready+" "+ tofix+ " "+ rejects);
  }
}