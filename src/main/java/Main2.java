import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int k = scanner.nextInt();

        PriorityQueue<String> heap = new PriorityQueue<>(Comparator.reverseOrder());
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {

                String sub = s.substring(i, j);
                if (!set.contains(sub)) {
                    heap.add(sub);
                    if (heap.size() > k) {
                        heap.poll();
                    }
                    set.add(sub);
                }

            }
        }

        System.out.println(heap.peek());
    }
}
