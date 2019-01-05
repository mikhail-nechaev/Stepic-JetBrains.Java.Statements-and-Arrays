import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[][] tab = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        tab[i][j] = sc.nextInt();
      }
    }

    a = 0;
    b = 0;


    int maxValue = tab[0][0];
    for (int j = 0; j < tab.length; j++) {
      for (int i = 0; i < tab[j].length; i++) {
        if (tab[j][i] > maxValue) {
          maxValue = tab[j][i];
          a = j;
          b = i;
        }
      }
    }

    System.out.println(a + " " + b);

  }

}