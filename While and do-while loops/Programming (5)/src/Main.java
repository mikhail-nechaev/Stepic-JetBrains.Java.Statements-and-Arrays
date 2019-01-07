import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int elem_counter = 1;
    int cur_counter = 1;
    int cur_value = 1;
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    while (elem_counter <= amount) {
      while ((cur_counter <= cur_value) && (elem_counter<=amount)) {
        cur_counter++;
        elem_counter++;
        System.out.print(cur_value + " ");
      }
      cur_value++;
      cur_counter = 1;
    }
  }
}


