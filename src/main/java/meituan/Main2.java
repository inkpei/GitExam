package meituan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                int tmp = scanner.nextInt();
                if (flag && !set.contains(tmp)) {
                    ans[i] = tmp;
                    set.add(tmp);
                    flag = false;
                }
            }
        }

        System.out.println(Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")));


    }
}
