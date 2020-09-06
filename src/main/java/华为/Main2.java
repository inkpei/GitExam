package 华为;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(";");
        String from = trans(arr[0]);
        String to = trans(arr[1]);
        String[] fromArr = from.split(" ");
        String[] toArr = to.split(" ");
        int a = minDistance(fromArr, toArr);
        System.out.printf("(%d,%d)%n", a, toArr.length);

    }

    static String trans(String s) {
        s = s.toLowerCase();
        s = s.replace(",", ".");
        s = s.replace("!", ",");
        s = s.replace(".", " . ");
        s = s.replace("?", " ? ");
        return s.replaceAll(" +", " ").trim();

    }

    static int minDistance(String[] word1, String[] word2) {
        int[][] dp = new int[word1.length + 1][word2.length + 1];
        for (int i = 0; i <= word1.length; i++) {
            for (int j = 0; j <= word2.length; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else {
                    if (word1[i - 1].equals(word2[j - 1])){
                        dp[i][j] = dp[i - 1][j - 1];
                    }else{
                        dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                    }

                }
            }
        }
        // ArrayUtil.print(dp);
        return dp[word1.length][word2.length];
    }

}
