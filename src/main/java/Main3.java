import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

    static HashMap<Long, Long> map = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long max = 0;
        int total = scanner.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int q = 0; q < total; q++) {
            list.add(scanner.nextLong());
        }
        Collections.sort(list);
        for (int i = 1; i <= list.get(list.size() - 1); i++) {
            get(i);
        }
        for (Long cur : list) {
            for (int i = 1; i <= cur; i++) {
                max = Math.max(max, get(i) + get(cur - i));
            }
            System.out.println(max);
            max = 0;
        }
    }

    static long get(long x) {
        if (map.containsKey(x)) {
            return map.get(x);
        } else {
            long ans = 0;
            long p = x;
            while (x != 0) {
                ans += x % 10;
                x /= 10;
            }

            map.put(p, ans);
            return ans;
        }
    }
}
