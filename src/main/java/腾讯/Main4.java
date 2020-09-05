package 腾讯;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        if (min > N) {
            System.out.println(N);
        } else {
            int ans = 0;
            for (int i : arr) {
                if (i == min) ans++;
            }
            System.out.println(min + N - ans);
        }
    }
}
