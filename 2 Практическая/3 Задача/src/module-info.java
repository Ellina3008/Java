package Main;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = 4;
        int m = 4;
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=r.nextInt(10);
            }
        }

        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        int znach;
        System.out.print("Введите значение: ");
        Scanner in = new Scanner(System.in);
        znach=in.nextInt();
        Vector<Integer> B = new Vector<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(mat[i][j]!=znach)
                    B.add(mat[i][j]);
            }
        }

        System.out.print("Содержимое вектора B: ");
        for (int i = 0; i < B.size(); i++) {
            System.out.print(B.get(i)+" ");
        }
    }
}