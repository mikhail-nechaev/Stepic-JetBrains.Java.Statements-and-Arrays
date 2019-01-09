import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] grades = new int[4];
    int amount = scanner.nextInt();
    for (int i = 0; i < amount; i++) {
      int nextGrade = scanner.nextInt();
      switch (nextGrade) {
      case 2:
        grades[0]++;
        break;
      case 3:
        grades[1]++;
        break;
      case 4:
        grades[2]++;
        break;
      case 5:
        grades[3]++;
        break;
      }
    }
    for (int i: grades) {
      System.out.print("" + i + " ");
    }
  }
}