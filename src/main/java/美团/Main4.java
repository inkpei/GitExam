package 美团;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < m; i++) {
            for (int j = i + 1; j <= m; j++) {
                if (get(arr, i, j)) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean get(int[] arr, int a, int b) {
        int pre = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < a || arr[i] > b)) {
                if (arr[i] < pre) {
                    return false;
                }
            }
        }
        return true;
    }
}
