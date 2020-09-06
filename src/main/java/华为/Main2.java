package 华为;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(";");
        String[] from = trans(arr[0]);
        String[] to = trans(arr[1]);
        int a = longestCommonSubsequence(from, to);
        System.out.printf("(%d,%d)%n", a, to.length);

    }

    static String[] trans(String s) {
        s = s.toLowerCase();
        s = s.replace(",", ".");
        s = s.replace("!", ",");
        s = s.replace(".", " . ");
        s = s.replace("?", " ? ");
        s = s.replaceAll(" +", " ").trim();
        String[] arr = s.split(" ");
        ArrayList<String> tmp = new ArrayList<>();
        for (String s1 : arr) {
            if (s1.length() > 0) {
                tmp.add(s1);
            }
        }
        String[] strings = new String[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            strings[i] = tmp.get(i);
        }
        return strings;

    }

    public static int longestCommonSubsequence(String[] text1, String[] text2) {
        int m = text1.length, n = text2.length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 获取两个串字符
                String c1 = text1[i], c2 = text2[j];
                if (c1.equals(c2)) {
                    // 去找它们前面各退一格的值加1即可
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    //要么是text1往前退一格，要么是text2往前退一格，两个的最大值
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return (text1.length - dp[m][n]) * 2;
    }


    static int minDistance(String[] s1, String[] s2) {
        int[][] dp = new int[s1.length + 1][s2.length + 1];
        for (int i = 0; i <= s1.length; i++) {
            for (int j = 0; j <= s2.length; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else {
                    if (s1[i - 1].equals(s2[j - 1])) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = 1 + dp[i][j - 1];
                    }

                }
            }
        }
        // ArrayUtil.print(dp);
        return dp[s1.length][s2.length];
    }

}

/*

i need book.; I need book 2.
i need book8.; I need book.
i need     book   .  ;   I need book 2.
this is a book8. ; this is a book 8.
this is a book8. ; this is a book.
 */
