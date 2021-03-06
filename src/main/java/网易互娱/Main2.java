package 网易互娱;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    static int[] arr;

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        arr = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(judge(0, Long.MIN_VALUE, Long.MAX_VALUE) ? 1 : 0);
    }

    static boolean judge(int index, long left, long right) {
        if (index >= arr.length) return true;
        if (arr[index] <= left || arr[index] >= right) return false;
        return judge(2 * index + 1, left, arr[index]) && judge(2 * index + 2, arr[index], right);
    }
}

