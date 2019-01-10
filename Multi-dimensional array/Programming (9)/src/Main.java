import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> list = new LinkedList<>();
    String tmp = "";
    while (!(tmp = scanner.nextLine()).equals("end")) {
      list.add(tmp);
    }

    String[] strArr;
    int n = list.size();
    int m = list.peekFirst().split(" ").length;
    int[][] arr = new int[n][m];
    for (int i = 0; i < list.size(); i++) {
      tmp = list.get(i);
      strArr = tmp.split(" ");
      for (int j = 0; j < strArr.length; j++) {
        arr[i][j] = Integer.parseInt(strArr[j]);
      }
    }

//        for (int[] a: arr) {
//            for (int i: a) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int jotPlusOne = j == m-1 ? 0 : j + 1;
        int iPlusOne = i == n-1 ? 0 : i + 1;
        int jotMinusOne = j == 0 ? m-1 : j-1;
        int iMinusOne = i == 0 ? n-1 : i-1;
        int sum = arr[iMinusOne][j] + arr[iPlusOne][j] + arr[i][jotMinusOne] + arr[i][jotPlusOne];
        System.out.print(sum + " ");
      }
      System.out.println();
    }
  }
}