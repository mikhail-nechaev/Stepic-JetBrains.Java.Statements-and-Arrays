import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder input = new StringBuilder();
            while (scanner.hasNextLine()) {
                String tmp = scanner.nextLine();
                if (!tmp.equals("end")) {
                    input.append(tmp).append("\n");
                } else {
                    break;
                }
            }

            String[] strings = input.toString().split("\n");
            int[][] a = new int[strings.length][];
            for (int i = 0; i < a.length; i++) {
                String[] s = strings[i].split(" ");
                a[i] = new int[s.length];
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }

            int[][] b = new int[a.length][a[0].length];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    int res = 0;
                    if (i - 1 < 0) {
                        res += a[a.length - 1][j];
                    } else {
                        res += a[i - 1][j];
                    }

                    if (i + 1 > a.length - 1) {
                        res += a[0][j];
                    } else {
                        res += a[i + 1][j];
                    }

                    if (j - 1 < 0) {
                        res += a[i][a[i].length - 1];
                    } else {
                        res += a[i][j - 1];
                    }

                    if (j + 1 > a[i].length - 1){
                        res += a[i][0];
                    } else {
                        res += a[i][j + 1];
                    }

                    b[i][j] = res;
                }
            }

            for (int[] ints : b) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }
    }
}