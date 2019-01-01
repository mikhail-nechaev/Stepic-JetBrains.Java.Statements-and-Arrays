import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<List<Integer>> list = new ArrayList<>();
            String row;
            while (!(row = scanner.nextLine()).equals("end")) {
                list.add(Arrays.stream(row.split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            }
            int count1 = list.size();
            int count2 = list.get(0).size();
            int[][] matrix = new int[count1][count2];
            for (int i = 0; i < count1; i++) {
                for (int j = 0; j < count2; j++) {
                    int tp = i - 1 >= 0      ? i - 1 : count1 - 1;
                    int lf = j - 1 >= 0      ? j - 1 : count2 - 1;
                    int bt = i + 1 < count1 ? i + 1 : 0;
                    int rt = j + 1 < count2 ? j + 1 : 0;
                    matrix[i][j] =
                            list.get(tp).get(j) +
                            list.get(i).get(lf) +
                            list.get(bt).get(j) +
                            list.get(i).get(rt);
                }
            }
            for (int i = 0; i < count1; i++) {
                for (int j = 0; j < count2; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}