package meituan;

import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
    static int[][] arr;
    static int max = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
           int x =  scanner.nextInt()-1;
            int y = scanner.nextInt()-1;
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        get(a - 1, b - 1, 0);
        System.out.println(max);
    }

    static void get(int a, int b, int k) {
        if (a == b) {
            max = Math.max(k, max);
            return;
        }
        if (arr[a][b] == 1) {

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[b][i] == 1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[a][j] == 1) {
                        get(j, i, k + 1);
                    }
                }
            }
        }


    }
}
