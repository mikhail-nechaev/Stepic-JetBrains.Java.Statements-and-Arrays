import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long M = scanner.nextLong();
    int i = 1;
    long res;
    int temp;

    while (true){
      res = 1;
      temp = i;
      while (temp > 1){
        res*=temp;
        temp--;
      }
      if (res > M){
        System.out.println(i);
        return;
      }
      i++;
    }

  }
}