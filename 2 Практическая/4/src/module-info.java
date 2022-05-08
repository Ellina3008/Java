import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        Vector<Integer> elements = new Vector<>();

        for (int i = 0; i < n - 1; i++) {
            if (mat[i][i + 1] > 0)
                elements.add(mat[i][i + 1]);
        }

        if (elements.isEmpty()) {
            System.out.println("Положительных элементов на искомой диагонали нет!");
        } else {
            int sum = 0;
            for (int i = 0; i < elements.size(); i++) {
                sum += elements.get(i);
            }
            double srArif = (double) sum / elements.size();
            System.out.println("Среднее арифметическое: " + srArif);
        }

    }
}