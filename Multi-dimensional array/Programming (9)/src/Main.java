import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer[]> pre = new ArrayList<>();
    String line = sc.nextLine();
    while(!line.equals("end")) {
      String[] elements = line.split(" ");
      Integer[] elems = new Integer[elements.length];
      for (int i=0; i<elems.length; i++) {
        elems[i] = Integer.valueOf(elements[i]);
      }
      pre.add(elems);
      line = sc.nextLine();
    }
    int rows = pre.size();
    int columns = pre.get(0).length;
    int res[][] = new int[rows][columns];
    int t, b, l, r, cell;
    for (int i=0; i<rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (i-1>=0)
          t = pre.get(i-1)[j];
        else
          t = pre.get(rows - 1)[j];
        if (i+1<=rows - 1)
          b = pre.get(i+1)[j];
        else
          b = pre.get(0)[j];
        if (j-1>=0)
          l = pre.get(i)[j - 1];
        else
          l = pre.get(i)[columns - 1];
        if (j+1<=columns - 1)
          r = pre.get(i)[j+1];
        else
          r = pre.get(i)[0];
        cell = t+b+l+r;
        res[i][j] = cell;
      }
    }
    for (int i=0; i<rows;i++) {
      for (int j=0; j<columns; j++) {
        System.out.print(res[i][j]+" ");
      }
      System.out.println();
    }
  }
  }