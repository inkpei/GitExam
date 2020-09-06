package 招银;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    static boolean[] flag;
    static int[][] arr;
    static ArrayList<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int start = scanner.nextInt();
        flag = new boolean[N];
        dfs(start, new StringBuilder());
        for (String an : ans) {
            if (an.endsWith(String.valueOf(start)))
                System.out.println(an.substring(0, an.length() - 1));
        }
    }

    static void dfs(int from, StringBuilder cur) {
        if (flag[from]) {
            cur.append(from);
            ans.add(cur.toString());
            cur.deleteCharAt(cur.length() - 1);
            return;
        }
        flag[from] = true;
        cur.append(from);
        for (int i = 0; i < arr.length; i++) {
            if (arr[from][i] == 1 && i != from) {
                dfs(i, cur);
            }
        }
        cur.deleteCharAt(cur.length() - 1);
        flag[from] = false;
    }
}

/*

5
0 1 0 0 0 0 0 1 1 0 1 0 0 0 0 0 0 0 0 1 0 1 1 0 0
4

 */
