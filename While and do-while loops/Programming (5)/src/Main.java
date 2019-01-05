import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int howMany = scanner.nextInt();
    int count = 0;
    int curr = 1;

    while (true){
      for (int i = 0; i < curr; i++){
        System.out.println(curr);
        count++;
        if (count == howMany)
          break;
      }
      if (count == howMany)
        break;
      curr++;
    }

  }
}