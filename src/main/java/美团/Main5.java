package 美团;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < m; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (input.length == 2) {
                System.out.println(ans[input[1] - 1] == Integer.MAX_VALUE ? -1 : ans[input[1] - 1]);
            } else {
                System.arraycopy(arr, input[2] - 1, ans, input[3] - 1, input[1]);
            }
        }
    }
}
