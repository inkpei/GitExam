package 网易互娱;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(get(arr));
    }
    public static int get(int[] nums) {
        if (nums.length <1) return 1;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                count++;
                min = Math.min(min, nums[i]);
            }
        }
        if (min != 1) return 1;
        boolean[] res = new boolean[count];
        for (int i : nums) {
            if (i> 0 && i - min < res.length) {
                res[i - min] = true;
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (!res[i]) return i + min;

        }
        return min + res.length;
    }


}
