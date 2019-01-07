import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer[]> matrix = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    String line = scan.nextLine();
    while (!line.equals("end"))
    {
      String[] elems = line.split("\\s");
      Integer[] rowInt = new Integer[elems.length];
      for (int i = 0; i < rowInt.length; i++)
      {
        rowInt[i] = Integer.valueOf(elems[i]);
      }
      matrix.add(rowInt);
      line = scan.nextLine();
    }

    int rows = matrix.size();
    int columns = matrix.get(0).length;
    int[][] matrix2 = new int[rows][columns];

    int top, bottom, left, right, current;

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
      {
        if (i - 1 < 0)
        {
          top = matrix.get(rows - 1)[j];
        }
        else
        {
          top = matrix.get(i - 1)[j];
        }

        if (i + 1 > rows - 1)
        {
          bottom = matrix.get(0)[j];
        }
        else
        {
          bottom = matrix.get(i + 1)[j];
        }

        if (j - 1 < 0)
        {
          left = matrix.get(i)[columns - 1];
        }
        else
        {
          left = matrix.get(i)[j - 1];
        }

        if (j + 1 > columns - 1)
        {
          right = matrix.get(i)[0];
        }
        else
        {
          right = matrix.get(i)[j + 1];
        }

        current = top + bottom + left + right;

        matrix2[i][j] = current;
      }
    }

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
      {
        System.out.print(matrix2[i][j] + " ");
      }
      System.out.println();
    }

  }
}