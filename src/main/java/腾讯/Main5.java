package 腾讯;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (i == 0) {
                    dp[j][j + i] = true;
                } else {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (Math.abs(j - i) == 1) {
                            dp[j][j + i] = true;
                        } else {
                            dp[j][j + i] = dp[j + 1][j + i - 1];
                        }
                    }
                }

            }
        }
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int left = scanner.nextInt()-1;
            int right = scanner.nextInt()-1;
            int ans = 0;
            if (dp[left][right]) {
                ans = 1;
                System.out.println(1);
            } else {
                cmax = Integer.MAX_VALUE;
                trace(left, right, 0, dp);
                System.out.println(cmax);
            }
        }
    }

    static int cmax = Integer.MAX_VALUE;
    static void trace(int a, int b, int k, boolean[][] dp) {
        if (a > b) {
            cmax = Math.min(cmax, k);
            return;
        }
        for (int i = a; i <= b; i++) {
            if (dp[a][i]) {
                trace(i + 1, b, k + 1, dp);
            }
        }
    }
}
